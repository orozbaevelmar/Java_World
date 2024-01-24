package Lesson.L19_Exceptions;

import java.io.*;

// 12.Если исключение выбрасывается из catch блока, то оно не может быть обработанно одноуровневым catch блоком.

public class Exception4 {
// -12-
    static String abc(){
        String s1="";
        String s2=null;
        try{
            try{
                s1+="1";
                s2.charAt(3);
                s1+="2";
            }
            catch (NullPointerException e){
                s1+="3";
                throw new RuntimeException();
            }
            finally{
                s1+="4";
                throw new Exception();
            }
        }
        catch(Exception e){
            s1+="5";
        }
        return s1;
    }

    static FileInputStream fis1,fis2;
    public static void main(String[] args) {
        System.out.println(abc());
        System.out.println();
        try{
            fis1=new FileInputStream("test112.txt");
            System.out.println("File test112 suschestvuet v systeme i nayden");
            try{
                fis2.close();
            }
            catch(IOException e){
                System.out.println("Problemy so stream-om fis2");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("file test112 ne nayden");
        }
        catch(NullPointerException e){
            System.out.println("Srabotalo NullPointerException");
        }
    }
}
