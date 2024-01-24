package Lesson.L19_Exceptions;

// 2.Если в части кода, которая НЕ находится в блоке try или в блоке try выбрасывается исключение, то соответствующая оставщаяся часть кода
//   уже не обрабатывается
// 3.После выброса исключения мы можем увидеть стэк трейс для всех методов, задействованных в выбросе этого исключения.
// 4.При создании объекта исключения вы можете воспользоваться его конструктором, который принимает String параметр и вписать в него
//    необходимую информацию. Вы также можете воспользоваться конструктором, который не принимает параметры.
// 5.catch(Exception e){
//      System.out.println(e);                  выводит на экран тип исключения и сообщение(мессаж)
//      System.out.println(e.getMessage());     выводит на экран сообщение(мессаж)
//      e.printStackTrace();}                   выводит на экран стэк трейс

import java.io.*;

// 6.Finally блок выполняется даже  в том случае, если в try блоке или в catch блоке имеется Return statement
// 7.Finally блок не выполнится в том случае, если вы прекращаете работу программы с помощью System.exit в try блоке или catch блоке или же,
//   если происходит крушение JVM или, например, операционной системы
// 8.Если return statement имеется в catch блоке, и в finally блоке, то оутпутом метода будет возвращаемое значение из finally блока
// 9.Если Return statement в catch блоке возвращает primitive data type, то в finally блоке вы его изменить не сможете. Если Return statement
//    в catch блоке возвращает reference data type, то в finally блоке вы его сможете изменить(естественно если тип mutable(if НЕ String))
// 10.Исключение может быть перевыброшено. Это обычно делают тогда, когда код вашего текущего метода обработал данное исключение не полностью и
//   выбрасывает его вновь, чтобы метод, который будет вызывать текущий метод, который будет вызывать текущий метод завершил обработку данного исключения
// 11.При написании кода, вы можете использовать вложенные блоки try, catch и finally
//
public class Exception3 {
// 6
    static int abc(){
        try{
            File f=new File("text.txt");
            FileInputStream fm=new FileInputStream(f); //Exception
// -2-
            System.out.println(12);
            System.out.println(43);
            return 1;
        }
        catch (FileNotFoundException e){
            System.out.println("Exception poiman");
            return 2;
        }
        finally {
            System.out.println("Eto finally");
            return 3;
        }
        //return 987;   WRONG
    }
/* -9- */    static int def(){
        int a=4;
        try{
            File f=new File("text8.txt");
            FileInputStream fm=new FileInputStream(f);
        }
        catch (FileNotFoundException e){
            System.out.println("Exception poiman-2");
            System.out.println("Perememmaya A v catch blocke = "+a);
            return a;
        }
        finally {
            a=5; // Copy von variable A
            System.out.println("Perememmaya A v finally blocke = "+a);
        }
        return a;  //      a==4
    }

/* -9- */    static StringBuilder gha(){
        StringBuilder sb=new StringBuilder("Hi");
        try{
            File f=new File("text8.txt");
            FileInputStream fm=new FileInputStream(f);
        }
        catch (FileNotFoundException e){
            System.out.println("Exception poiman-3");
            System.out.println("Perememmaya SB v catch blocke = "+sb);
            return sb;
        }
        finally {
            sb.append("!!!"); // Copy von variable SB, aber er verweist auf eine Object
            System.out.println("Perememmaya SB v finally blocke = "+sb);
        }
        return sb;
    }

    void klm() throws FileNotFoundException{
        try{
            File f=new File("text8.txt");
            FileInputStream fm=new FileInputStream(f);
        }
        catch (FileNotFoundException e){
            System.out.println("Exception poiman i nemnogo obrabotan");
            throw e;
        }
        finally {
            System.out.println("Eto block finally");
        }
    }
// -11-
    FileInputStream fis1,fis2;
    public void xyz() {
        try {
            fis1 = new FileInputStream("test112.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("file test10 ne nayden");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file test9 ne nayden");
        } finally {
            System.out.println("Eto vneshnyi finally block");
            try{
                fis1.close();
                fis2.close();
            }
            catch(IOException e){
                System.out.println("Naydenno iskluchenie v finally block");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(abc());
        System.out.println();
        System.out.println(def());
        System.out.println();
        System.out.println(gha());
        System.out.println();
        Exception3 ex=new Exception3();
        ex.xyz();
    }
}
