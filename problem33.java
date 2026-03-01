
//Write a program to read a string and delete the character at index 3. 
import java.util.Scanner;
public class problem33 {
    public static void main(String args[]){
            Scanner obj=new Scanner(System.in);
            String st;
            System.out.print("Enter a string: ");
            st=obj.next();
            if(st.length()>3){
                System.out.println(st.substring(0,3)+st.substring(4));
            }else{
                System.out.println("String must be length of 4 characters1");
            }

    }
}
