//Write a program to sort numeric array. 
import java.util.Scanner;
public class problem43{
    public static void main(String args[]){
        int n,i,j,temp;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no of element: ");
        n=obj.nextInt();
        int[] arr=new int[n]; 
        for(i=0;i<n;i++){
            System.out.print("Enter ["+(i+1)+"]" +" Element : ");
            arr[i]=obj.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Numbers in ascending order :");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

















//To generate random number
/* 
import java.util.*;
public class problem43{
    public static void main(String args[]){
        Random random=new Random();
        System.out.println(random.nextInt(10,20));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextLong());
    }
}
*/
//Example of map
/* 
import java.util.*;
public class problem43{
    public static void main(String args[]){
        HashMap<String,Integer> map= new HashMap<>();
        map.put("Rajan",17);
        map.put("Ranjana",21);
        map.put("Mikasa",23);
        System.out.println(map);
        System.out.println(map.get("Rajan"));
        System.out.println(map.containsKey("Rajan"));
        System.out.println(map.containsValue(25));
        //terving of data in Map
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
    */


//Example of HashMap
/* 
import java.util.*;
public class problem43{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(17,"Rajan");
        map.put(18,"Ranjana");
        map.put(19,"Mikasa");
        System.out.println(map);
        System.out.println(map.containsKey(17));
        System.out.println(map.containsValue("Ranjana"));
        //terversing of Hashmap
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
    */
   