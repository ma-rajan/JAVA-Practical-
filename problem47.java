/*
Write a program to sort name of any five cities in ascending order
WAP to create Set with following value: {“London”, “New York”,
“SanFrancisco”, “Beijing”, “New York”}. Perform following operation
on above Set.
− add new element
− get Set size – remove element – Contains element?
− addAll
− removeAll
− retainAll
*/
import java.util.*;
public class problem47 {
    public static void main(String args[]){
   HashSet<String> set=new HashSet<>();
   set.add("London");
   set.add("New York");
   set.add("SanFrancisco");
   set.add("Beijing");
   System.out.println(set);
    //add new element
    set.add("Tokyo");
    set.add("Kathmandu");
    //get Set size
    System.out.println("Size of set: "+set.size());
    //remove element
    set.remove("SanFrancisco");
    System.out.println(set);
    //contains element
    System.out.println("Contains element or not in  set: "+set.contains("Kathmandu"));
    //Addall
    HashSet<String> set2= new HashSet<>();
    set2.add("Pokhara");
    set2.add("Chitwan");
    set.addAll(set2);
    System.out.println(set);
    //removeall
    set.removeAll(set2);
    System.out.println(set);
    //retainall
   
        // retainAll
        Set<String> set3 = new HashSet<>();
        set3.add("London");
        set3.add("Tokyo");

        set.retainAll(set3);
        //only print if set==set3 elements  (retain)meaning
        System.out.println("After retainAll: " + set);
    }
}
