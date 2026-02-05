/*
Write java program to illustrate the concept of NullPointerException and
NumberFormatException
*/
public class problem28 {
    public static void main(String args[]){
        //NullPointerException
        try{
            String s=null;
            System.out.println(s.toUpperCase());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }


        //NumberFormatException
        try{
            String st="Apple";
            int n=Integer.parseInt(st);
            System.out.println(n);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
