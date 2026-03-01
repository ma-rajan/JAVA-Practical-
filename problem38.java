/*
Write a program to create a file and write content on it..
*/
/*

//1. using FileWriter calss and FIle class  (FileWriter =>used to write content in file in text based)
import java.io.*;
public class problem38 {
    public static void main(String args[]){
        try{
            File file=new File("//home//rajan//Documents//text.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw=new FileWriter(file);
            fw.write("Hello my name is Rajan Mahato");
            fw.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            System.out.println("program executed...!");
        }
    }
    
}





*/
// 2.using FileReader && File class(FileReader=>it is used to read the content on the file)
/* 
import java.io.*;
public class problem38{
    public static void main(String args[]){
        File file=new File("//home//rajan//Documents//text.txt");
        try{
            if(!file.exists()){
                System.out.println("File is not avilable");
            }else{
                FileReader fr=new FileReader(file);
                int ch;
                while((ch=fr.read())!=-1){
                    System.out.print((char)ch);
                }
            }
        }
        catch(IOException e){
        System.out.println(e);            
        }

        finally{
            System.out.println();
            System.out.println("Program is executed...!");
        }
    }
}
*/







/* 3.  using FileOutputStream and FIle  
(FileOutputStream => it is used It takes data from your program and stores it into a file. It does NOT print output to screen. )
*/
/*
import java.io.*;
public class problem38{
    public static void main(String args[]){
        File file=new File("//home//rajan//Documents//demo.txt");
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fis=new FileOutputStream(file);
            fis.write(97);
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Program is executed");
        }
    }
}
    */


/*
4. FileInputStream & File class(It takes data from a file and brings it into your program. It does NOT take data from user.)
*/
/* 
import java.io.*;
public class problem38{
    public static void main(String args[]){
        File file=new File("//home//rajan//Documents//demo.txt");
        try{
            if(!file.exists()){
                System.out.println("File is not exists....!");
            }else{
                FileInputStream fis=new FileInputStream(file);
         
                int ch;
                while((ch=fis.read())!=-1){
                    System.out.print((char)ch);
                }
                fis.close();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
*/



//Write a program to copy the content of one file to another file. 
//using FileInputStream & FIleOutputStream
/* 
import java.io.*;

public class problem38 {
    public static void main(String[] args) {
        try {
            File sourceFile = new File("/home/rajan/Documents/demo.txt");
            File destFile = new File("/home/rajan/Documents/demo1.txt");

            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist!");
                return;
            }

            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            int ch;
            while ((ch = fis.read()) != -1) {  
                fos.write(ch);                
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
*/



////Write a program to copy the content of one file to another file. 
/// using FileReader && FileWriter
import java.io.*;
public class problem38 {
    public static void main(String args[]) {
        try {
            File file1 = new File("/home/rajan/Documents/demo.txt");
            File file2 = new File("/home/rajan/Documents/text1.txt");

            if (!file1.exists()) {
                System.out.println("Source file does not exist!");
                return;
            }

            FileReader fr = new FileReader(file1);
            FileWriter fw = new FileWriter(file2);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Program executed!");
    }
}
