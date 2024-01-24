package Lesson.L19_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Обработка исключений позволяет нам разграничивать код на код, который должен выполняться при обычном протекании программы и код,
//                                      который должен выполняться при выброске исключений
// Object-->Throwable-->Exception-->(1.RuntimeException, 2.IOException-->FileNotFoundException
//                  |__>Error-->

// 1.Очередность catch блоков очень важна. Компилятор не пропустит код, если исключение "SUPER class" будет стоять перед
//          исключением "SUB class
public class Exception_1 {
    public static void main(String[] args) {
        String s=null;
        File f=new File("txt112.txt");

        try{
            FileInputStream fm=new FileInputStream(f);
            System.out.println(s.length());
        }
// -1-
        catch(NullPointerException e) {
            System.out.println("Poiman Exception 1");
        }
        catch(RuntimeException e){
            System.out.println("Poiman Exception 2");
        }
        catch(FileNotFoundException e){
            System.out.println("Poiman Exception 3");
        }
        catch(IOException e){
            System.out.println("Poiman Exception 4");
        }
        catch(Exception e){
            System.out.println("Poiman Exception 5");
        }
        catch (Throwable e){
            System.out.println("Poiman Exception 6");
        }
        finally{
            System.out.println("Gehen wir weiter");
        }
    }
}