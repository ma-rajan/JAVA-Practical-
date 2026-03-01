/*
Write a program to implement stack operation using Stack class.
*/

import java.util.*;

public class problem42 {

    // pushing elements into stack
    static void stack_push(Stack<Integer> stack) {
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println("Stack after push: " + stack);
    }

    // popping elements from stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Popped elements:");
        while (!stack.isEmpty()) {
            Integer y = stack.pop();   
            System.out.println(y);
        }
    }

    // display top element
    static void stack_peek(Stack<Integer> stack) {
        Integer element = stack.peek();
        System.out.println("Element at top of stack: " + element);
    }

    // searching element in stack
    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer)stack.search(element);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + pos);
        }
    }

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_peek(stack);

        stack_search(stack, 2);
        stack_search(stack, 6);

        stack_pop(stack);
    }
}





/* 
//stack operation:
import java.util.*;
public class problem42{
    //push operation
    static void stack_push(Stack<Integer> stack){
        System.out.println("Pushed element are: ");
        for(int i=2;i<=10;i+=2){
            stack.push(i);
        }
        System.out.print(stack);
        System.out.println();
    }

    //pop operation
    static void stack_pop(Stack<Integer> stack){
        System.out.println("pop iteams are: ");
        while(!stack.isEmpty()){
            Integer element =stack.pop();
            System.out.println(element);
        }
    }

    //peek operation
    static void stack_peek(Stack<Integer> stack){
        if(!stack.isEmpty()){
        System.out.print("Peek element in stack is: "+stack.peek());
        }else{
            System.out.println("Stack underflow");
        }
        System.out.println();
    }

    //search operation 
   static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = stack.search(element);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + pos);
        }
    }
    public static void main(String args[]){
        Stack<Integer> stack=new Stack<Integer>();
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
    }   
}
    */