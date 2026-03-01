/*
Write a program to illustrate Integer and Double class as a wrapper class
of int and double respectively
*/
/* 
public class problem41 {
    public static void main(String args[]){
        
        int a = 17;

        // Autoboxing
        Integer i1 = Integer.valueOf(a); // explicit
        Integer i2 = a;                  // implicit (autoboxing)

        // Unboxing
        int i3 = i1.intValue();          // explicit
        int i4 = i2;                     // implicit (auto-unboxing)

        System.out.println("INTEGER WRAPPER CLASS:");
        System.out.println("Primitive data: " + a);
        System.out.println("Autoboxing: " + i1 + " " + i2);
        System.out.println("Unboxing: " + i3 + " " + i4);


        double d = 19.2;

        // Autoboxing
        Double d1 = Double.valueOf(d);   // explicit
        Double d2 = d;                    // implicit (autoboxing)

        // Unboxing
        double d3 = d1.doubleValue();    // explicit
        double d4 = d2;                  // implicit (auto-unboxing)

        System.out.println("\nDOUBLE WRAPPER CLASS:");
        System.out.println("Primitive data: " + d);
        System.out.println("Autoboxing: " + d1 + " " + d2);
        System.out.println("Unboxing: " + d3 + " " + d4);
    }
}
*/


//Double To Primitive Type
/* 
public class problem41{
    public static void main(String args[]){
        Double d=new Double("17.42");
        int i=d.intValue();
        double d1=d.doubleValue();
        float f=d.floatValue();
        byte b=d.byteValue();
        long l=d.longValue();
        short s=d.shortValue();
        
        System.out.println("Value of d after converting into int : "+i);
        System.out.println("Value of d after converting into double : "+d1);
        System.out.println("Value of d after converting into float : "+f);
        System.out.println("Value of d after converting into byte : "+b);
        System.out.println("Value of d after converting into long : "+l);
        System.out.println("Value of d after converting into short : "+s);
        
    }
}
    */


//compare wrapper class with values
/* 
public class problem41{
    public static void main(String args[]){
        Integer i=new Integer("17");

        System.out.println(i.compareTo(10));
        System.out.println(i.compareTo(20));
        System.out.println(i.compareTo(17));
    }
}
    */
   

//Equals or not check  in wrapper class with values
/* 
public class problem41{
    public static void main(String args[]){
        Integer i=new Integer("19");

        System.out.println(i.equals(17));
        System.out.println(i.equals(19));
        System.out.println(i.equals(18));
    }
}
    */

