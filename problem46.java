/*
Write a program to add “BCA”, “BBA”, ”BSCCSIT”, “BE” using hashset
*/
import java.util.*;

public class problem46 {
    public static void main(String args[]) {
        
        // Creating HashSet
        HashSet<String> courses = new HashSet<>();
        
        // Adding elements
        courses.add("BCA");
        courses.add("BBA");
        courses.add("BSCCSIT");
        courses.add("BE");
        
        // Displaying elements
        System.out.println("Courses in HashSet:");
        for(String course : courses) {
            System.out.println(course);
        }
        
        // Display size
        System.out.println("Total Courses: " + courses.size());
    }
}

/* 
import java.util.*;
public class problem46 {
    public static void main(String args[]){
        HashSet<String> programs=new HashSet<>();
        programs.add("BCA");
        programs.add("BBA");
        programs.add("BSCCSIT");
        programs.add("BE");
        //displaying elements in hashmap
        System.out.print(programs+"\t");
        System.out.println(programs.contains("BE"));
        System.out.println(programs.contains("BIT"));

        System.out.println(programs.remove("BSCCSIT"));
        System.out.print(programs+"\t");
    }
    
}
*/