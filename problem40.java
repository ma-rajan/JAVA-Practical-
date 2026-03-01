/*
Write a java program to write three student information (Roll, Name,
Address, College) into file student.txt and display the student information
*/
/* 

            Using Serializationa and deserialization
import java.util.Scanner;
import java.io.*;
class StudentInfo implements Serializable{
    int rollno;
    String name,address,college;
    StudentInfo(int rollno,String name,String address,String college){
        this.rollno=rollno;
        this.name=name;
        this.address=address;
        this.college=college;
    }
}
public class problem40 {
    public static void main(String args[]){
        try{
            //serialization
        FileOutputStream fos=new FileOutputStream("//home//rajan//Documents//Files//Student.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            Scanner obj=new Scanner(System.in);
            int[] arr=new int[3];
            int i;
            for(i=0;i<3;i++){
               System.out.println("Enter"+"["+(i+1)+"]"+" Student : ");
               System.out.print("Rollno: ");
               int  rollno=obj.nextInt();
                System.out.print("Name: ");
                String name=obj.next();
                System.out.print("Address: ");
                String address=obj.next();
                System.out.print("College: ");
                String college=obj.next();
               StudentInfo s1=new StudentInfo(rollno,name,address,college);
               oos.writeObject(s1);
            }
            oos.close();
            fos.close();

            //deserilization
            FileInputStream fis=new FileInputStream("//home//rajan//Documents//Files//Student.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            System.out.println("\n\nStudent Info are: ");
            for(i=0;i<3;i++){
            StudentInfo s2=(StudentInfo)ois.readObject();
            System.out.println(s2.rollno+" "+s2.name+" "+s2.address+" "+s2.college);
            }
            ois.close();
            fis.close();
            

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Program executed sucessfully....!");
        }
    }
}
*/



/* Write a java program to write three student information 
(Roll, Name, Address, College) into file student.txt 
and display the student information whose address is Chitwan. */
/* 
import java.util.*;
import java.io.*;

public class problem40 {
    public static void main(String args[]) {
        try {
            Scanner obj = new Scanner(System.in);

            // Writing data to file
            FileWriter fw = new FileWriter("/home/rajan/Documents/Files/student.txt");

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter [" + (i+1) + "] Student:");

                System.out.print("Rollno: ");
                int roll = obj.nextInt();

                System.out.print("Name: ");
                String name = obj.next();

                System.out.print("Address: ");
                String address = obj.next();

                System.out.print("College: ");
                String college = obj.next();

                // write each student in NEW LINE
                fw.write(roll + " " + name + " " + address + " " + college + "\n");
            }

            fw.close();

            // Reading file and filtering Chitwan students
            BufferedReader br = new BufferedReader(
                    new FileReader("/home/rajan/Documents/Files/student.txt"));

            String line;
            System.out.println("\nStudents from Chitwan:\n");

            while ((line = br.readLine()) != null) {
                String data[] = line.split(" ");

                // data[2] = Address
                if (data[2].equalsIgnoreCase("Chitwan")) {
                    System.out.println("Roll: " + data[0] +
                            " Name: " + data[1] +
                            " Address: " + data[2] +
                            " College: " + data[3]);
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
*/



/* Write a java program to write three student information 
(Roll, Name, Address, College) into file student.txt 
and display the student information whose address is Chitwan. */
import java.util.Scanner;
import java.io.*;
public class problem40{
    public static void main(String args[]){
        try{
            Scanner obj=new Scanner(System.in);
            File file=new File("//home//rajan//Documents//Files//test1.txt");
            FileWriter fw=new FileWriter(file);
            if(!file.exists()){
                file.createNewFile();
            }
            int i;
            for(i=0;i<3;i++){
                System.out.println("Enter ["+(i+1)+"] "+"Student information: ");
                System.out.print("Rollno: ");
                int rollno=obj.nextInt();
                System.out.print("Name: ");
                String name=obj.next();
                System.out.print("Address: ");
                String address=obj.next();
                System.out.print("College: ");
                String college=obj.next();
                fw.write(rollno+" \t"+name+" \t"+address+"\t"+college+"\n");
            }
            fw.close();
            BufferedReader br=new BufferedReader(new FileReader("//home//rajan//Documents//Files//test1.txt"));
            String line;
            System.out.println("Student informations are: ");
            while((line=br.readLine())!=null){
                    String data[]=line.split("\t");
                    if(data[2].equalsIgnoreCase("chitwan")){
                        System.out.println("Rollno: "+data[0]+"\t"+"Name: "+data[1]+"\t"+"Address: "+data[2]+"\t"+"College:"+data[3]);

                    }
            }
            br.close();
            
        }
        catch(Exception e){

        }
    }
}