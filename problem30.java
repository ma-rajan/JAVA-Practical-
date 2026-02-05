/*
Write a program to read two string from user and perform comparison
and concatenation of two strings
*/
import java.util.Scanner;
public class problem30 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String st1,st2;
        System.out.print("Enter first string:  ");
        st1=obj.next();
        System.out.print("Enter second string: ");
        st2=obj.next();

        if(st1.equals(st2)){
            System.out.println("Both string are same");
        }else{
            System.out.println("They are different");
        }
        System.out.println(st1.concat(st2));
    }
}
