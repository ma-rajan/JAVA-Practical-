/*
Write a program to illustrate the use of Exception handling.
*/

public class problem27 {
    public static void main(String args[]) {

        //  Arithmetic Exception
        try {
            int a = 10, b = 0;
            System.out.println("Division: " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        // Number Format Exception
        try {
            String str = "apple";
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println("Cannot convert string to number");
        }

        //  Array Index Exception
        try {
            int arr[] = {2, 3, 5, 1};
            System.out.println(arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

        System.out.println("Program executed successfully");
    }
}
