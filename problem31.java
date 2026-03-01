/*
Write a java program to identify the input string is palindrome or not?
*/
import java.util.Scanner;
public class problem31{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String st;
        System.out.print("Enter a string: ");
        st=obj.next();
        String rev="";
        int i;
        for(i=st.length()-1;i>=0;i--){
            rev+=st.charAt(i);
        }
        if(st.equals(rev)){
            System.out.println(st+ " : is a palindrome");
        }else{
            System.out.println(st+ " : is not palindrome");
        }
    }
}