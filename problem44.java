/*
Write a program to sort string array. 
*/
import java.util.*;
public class problem44{
    public static void main(String args[]){
        int n,i,j;
        String temp;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no of strings in array: ");
        n=obj.nextInt();
        String[] arr=new String[n];
        for(i=0;i<n;i++){
            System.out.print("Enter ["+(i+1)+"]"+" string: ");
            arr[i]=obj.next();
        }
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i].compareTo(arr[j])>0){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("String is sorted...!");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}