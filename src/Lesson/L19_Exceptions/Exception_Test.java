package Lesson.L19_Exceptions;
import java.io.*;
public class Exception_Test {
    public static void main(String[] args) {
        StringBuilder result=new StringBuilder("");
        String s = "";
        try{
        File f=new File("test112.txt");
            System.out.println("Object File hat geschaft");
            FileInputStream fis1=new FileInputStream(f);
            FileInputStream fis2=new FileInputStream(f);
            System.out.println("Stream sozdalsya");
            int counter=0;
            s=new String(fis1.readAllBytes());
            while(true){
                counter++;
                result.append((char)fis2.read());
                System.out.println("Informatsya schitaetsya");
                if (counter == 3) {
                    fis2.close();
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Exception 1");
        }
        catch(IOException e){
            System.out.println("Exception 2");
        }
        finally {
            System.out.println("Eto finally");
        }
        System.out.println(s);
        System.out.println(result);
    }
}
