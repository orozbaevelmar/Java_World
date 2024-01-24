package Lesson.L19_Exceptions;

import java.io.*;

public class File_Exception {
    public static void main(String[] args) {
        File f=new File("Test112.txt");  // File have
        File f1=new File("Test.txt");    // File havent
        try{
            FileInputStream fis = new FileInputStream(f);// Richtig
            System.out.println("Hello");
            fis.read();
            FileInputStream fis2=new FileInputStream(f1); // Wrong
        }
        catch (FileNotFoundException e){
            System.out.println("Byl poiman exception :"+e);
        }
        catch (IOException a){
            System.out.println("In file Test112 hat kein Charackter : " + a); // Для метода read выбрасываем IOException
        }
        catch (NullPointerException p){
            System.out.println("Byl poiman NullPointerException :"+p);
        }

        finally{
            System.out.println("Eto finally block");
        }
        System.out.println("Bye");
    }
}
