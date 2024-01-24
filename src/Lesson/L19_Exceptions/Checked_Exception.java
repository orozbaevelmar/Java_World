package Lesson.L19_Exceptions;

// Сабклассы Exception - checked exception
// Checked исключения указывают на часть кода, который находится за пределами непосредственного контроля программой и который может
// являться причиной выброса исключений. Они как правило возникают при взаимодействии вашей программы с внешними источниками.
// Они как правило возникают при взаимодействии вашей программы с внешними источниками(работа с файлами, с БД, с сетью), из за
// которых и могут возникать проблемы. Компилятор всегда проверяет возможность выброса Checked исключений.

// Checked исключения всегда должны быть или обьявлены и/или обработаны.
//

import java.io.*;

public class Checked_Exception {
    void abc1() throws FileNotFoundException{
        File f=new File("test112.txt");
        FileInputStream fis=new FileInputStream(f);
    }

    void abc2() throws FileNotFoundException{
        System.out.println(12);
        abc1();
    }

    void def1(){
        File f=new File("test8.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        }
        catch(FileNotFoundException e){
            IOException exp=e;
            FileNotFoundException exp1=e;
            System.out.println("Output Exception");
        }
    }
    void def2(){
        def1();
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("test112.txt");
        FileInputStream fis=new FileInputStream(f);
        System.out.println("Hi");

        Checked_Exception es=new Checked_Exception();
        System.out.println("\ndef na ekran = ");
        es.def2();
        System.out.println("abc na ekran = ");
        es.abc2();
    }
}
