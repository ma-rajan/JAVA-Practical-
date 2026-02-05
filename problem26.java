/*
Write a program to implement multiple inheritance using interface
*/
import java.util.Scanner;
interface sum{
    void sum();
}
interface div{
    void div();
}
class calculate implements sum,div{
    int a,b;
    calculate(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void sum(){
        System.out.println("Sum of two number: "+(a+b));
    }
    public void div(){
        try{
        System.out.println("Div of two number: "+(a/b));
    }
    catch(ArithmeticException e){
        System.out.println("cannot divide with zero");
    }
}
}

public class problem26 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a,b;
        a=obj.nextInt();
        b=obj.nextInt();
        calculate obj1=new calculate(a, b);
        obj1.sum();
        obj1.div();
    }
}
