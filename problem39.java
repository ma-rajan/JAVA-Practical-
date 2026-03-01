//Write a program to serialize an object.
/* 

                1..
import java.io.*;
class Emp implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int id;

    Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class problem39 {
    public static void main(String args[]) {
        try {
            Emp e1 = new Emp("Rajan", 17);

            FileOutputStream fos =new FileOutputStream("/home/rajan/Documents/Files/demo1.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e1);
            oos.close();
            fos.close();
            System.out.println("Object serialized successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
*/


////Write a program to serialize an object.
/// 
 /*
                2

import java.io.*;
class student implements Serializable{
    int rollno;
    String name;
    student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
}
public class problem39{
    public static void main(String args[]){

            try{
                student s=new student(17,"Rajan Mahato");
                FileOutputStream fos=new FileOutputStream("//home//rajan//Documents//Files//student.txt");
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(s);
                oos.close();
                fos.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                System.out.println("Program is executed sucessfully....!");
            }
    }
}
    */



/* 
// Example for serialization and deserialization
import java.io.*;
class FruitName implements Serializable{
        String f1,f2,f3;
        FruitName(String f1,String f2,String f3){
            this.f1=f1;
            this.f2=f2;
            this.f3=f3;
        }
}
public class problem39{
    public static void main(String args[]){
        try{
            //to write object in serialized form
            //serialized
            FruitName fn1=new FruitName("Apple","Banana","Carrot");
            FileOutputStream fos=new FileOutputStream("//home//rajan//Documents//Files//fruits.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(fn1);
            oos.close();
            fos.close();

            //to read serialized object from file
            //deserialized
            FileInputStream fis=new FileInputStream("//home//rajan//Documents//Files//fruits.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            FruitName fn2=(FruitName)ois.readObject();
            System.out.println(fn2.f1+" "+fn2.f2+" "+fn2.f3);
            ois.close();
            fis.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
    */


//using inheritance and interface for serialization and deserialization
import java.io.*;
class Collectionnames{
    String n1="[Rajan Mahato]";
    String n2="[Lady augusta]";
    String n3="[Undertaker]";
}
class names extends Collectionnames implements Serializable{
    String n4="[John Cena]";
    String n5="[Roman Rings]";
}
public class problem39{
    public static void main(String args[]){
        try{
            //for serialization
            names n1=new names();
            FileOutputStream fos=new FileOutputStream("//home//rajan//Documents//Files//NameCollections.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(n1);
            oos.close();
            fos.close();

            //for deserialization
            FileInputStream fis=new FileInputStream("//home//rajan//Documents//Files//NameCollections.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            names n2=(names)ois.readObject();
            System.out.println(n2.n1+" "+n2.n2+" "+n2.n3+" "+n2.n4+" "+n2.n5);
            fis.close();
            ois.close();
        }
        catch(Exception e){
            System.out.println(e);
    }
}
}
