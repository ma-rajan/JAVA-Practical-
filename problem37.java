/*
Write a java program to create two threads so that one thread prints even
number and other thread prints odd number between 100 and 200.
*/
class First implements Runnable{
    public void run(){
        int i;
        //even
        try{
        for(i=100;i<=200;i++){
            if(i%2==0){
                System.out.print("Even: "+i+"\t");
                Thread.sleep(1000);
            }
            
            }
    } catch(Exception  e){
        System.out.println(e);
    }
    }
}
class Second implements Runnable{
    public void run(){
        int i;
        //even
        try{
            for(i=100;i<=200;i++){
                if(i%2!=0){
                    System.out.print("Odd: "+i+"\t");
                     Thread.sleep(500);
                }
            }
       
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class problem37 {
    public static void main(String args[]){
         First f=new First();
         Second s=new Second();

         Thread t1=new Thread(f);
         Thread t2=new Thread(s);

         t1.start();
         t2.start();
    }
}
