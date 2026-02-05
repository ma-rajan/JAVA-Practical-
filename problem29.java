/*
Write a java program that will read college name from keyboard and
display it on screen. The program should throw an exception when length
of college name is more than 50.
*/

import java.util.Scanner;

public class problem29 {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your college name: ");
        String st = obj.nextLine();

        try {
            if (st.length() > 50) {
                throw new Exception("The length of string is greater than 50");
            }
            else {
                System.out.println("College name is: " + st);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
