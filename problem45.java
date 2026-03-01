/*
Write a program to implement linked list operation. 
*/
import java.util.*;
public class problem45 {
    public static void main(String args[]){
        LinkedList<Integer>list=new LinkedList<>();
        //adding element
        list.add(14);
        list.add(15);
        list.add(17);
        list.add(21);
        list.add(29);
        //display of linked list
        System.out.println("Linked list: "+list);
        //remove element
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing list: "+list);

        //searching element
        if(list.contains(15)){
            System.out.println("15 is avilable in linked list");
        }else{
            System.out.println("15 is not avilable in linked list");
        }

        //teversing of list
        for(Integer num: list){
            System.out.print(num+"\t");
        }
    }
}

/*
Important LinkedList Methods (For Exam)

add() → Add element

addFirst() → Insert at beginning

addLast() → Insert at end

remove() → Remove element

removeFirst() → Remove first element

removeLast() → Remove last element

contains() → Search element

*/
