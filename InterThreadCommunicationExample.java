class Data {
    private int value;
    private boolean available = false;

    // Producer puts value
    public synchronized void put(int val) {
        while (available) {  // wait if value is not consumed yet
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        value = val;
        available = true;
        System.out.println("Produced: " + val);
        notify();  // notify the consumer
    }

    // Consumer gets value
    public synchronized int get() {
        while (!available) { // wait if value is not produced yet
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        available = false;
        System.out.println("Consumed: " + value);
        notify();  // notify the producer
        return value;
    }
}

// Producer Thread
class Producer implements Runnable {
    private Data data;

    Producer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.put(i);
            try {
                Thread.sleep(500);  // simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Consumer Thread
class Consumer implements Runnable {
    private Data data;

    Consumer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.get();
            try {
                Thread.sleep(800);  // simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        Data data = new Data();

        Thread producer = new Thread(new Producer(data));
        Thread consumer = new Thread(new Consumer(data));

        producer.start();
        consumer.start();
    }
}

