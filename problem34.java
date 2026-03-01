//Write a program to illustrate a thread example. 



/* 1.Example

class Mythread extends Thread{
    public void run(){
        int i,n=5;
        try{
        for(i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
            Thread.sleep(1000);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
public class problem34{
public static void main(String args[]){

        Mythread obj=new Mythread();
        obj.start();
        int i,n=10;
            try{
        for(i=1;i<10;i++){
               System.out.println(n+"x"+i+"="+(n*i));
                Thread.sleep(500);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}
*/



/*2.Write a program to create a thread using the Runnable interface.
class Odd implements Runnable{
  public  void run(){
        int i;
        //even number
        try{
        for(i=1;i<=20;i++){
            if(i%2==0){
                System.out.print(i+"\t");
            }
        Thread.sleep(1000);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class problem34{
    public static void main(String args[]){

        Odd obj=new Odd();
        Thread t1=new Thread(obj);
        t1.start();
        try{
            int i;
            for(i=30;i<=50;i++){
                if(i%2!=0){
                    System.out.println(i+"\t");
                }
                Thread.sleep(500);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
*/


/*3.  Using interface: Write a program where two threads print numbers from 1 to 10 concurrently.
class NumberPrint implements Runnable{
    public void run(){
    try{
        int i;
        for(i=1;i<=10;i++){
            System.out.print(i+"\t");
            Thread.sleep(1000);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}
public class problem34{
    public static void main(String args[]){
        NumberPrint obj=new NumberPrint();
        Thread t1=new Thread(obj);
        t1.start();
        int i;
        try{
        for(i=1;i<=10;i++){
            System.out.print(i+"\t");
            Thread.sleep(500);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
        
    }
}
    */

//4. Real life problem of bus usign multi threading:
class Bus implements Runnable{
    int passenger,avilableseat=1;
    Bus(int passenger){
        this.passenger=passenger;
    }
    public void run(){
        String name=Thread.currentThread().getName();
        if(passenger>=avilableseat){
            System.out.println(name+ " Reseved seat..!");
            avilableseat=avilableseat-passenger;
        }else{
            System.out.println("Sorry seat is not avilable");
        }
    }
}
public class problem34{
    public static void main(String args[]){
        Bus r=new Bus(1);

        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);

        t1.setName("Ram");
        t1.setName("Sita");
        t2.setName("Hari");

        t1.start();
        t2.start();
        t3.start();
    }
}