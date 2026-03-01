/*
Write a program to read a string and display the character at index 3. 
*/
import java.util.Scanner;
public class problem32 {
        public static void main(String args[]){
            Scanner obj=new Scanner(System.in);
            String st;
            System.out.print("Enter a string: ");       
            st=obj.next();
            if(st.length()>3){
            System.out.println(st.charAt(3));
        }else{
                System.out.println("String should must be more then 4 character");
        }
}
}
