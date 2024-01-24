package Lesson.L19_Exceptions;

// 1.java.io-это пакет, в котором собраны классы и интерфейсы, которые предназначенны, если обобщить, для чтения и записи информации
//                  из/в какой-либо источник, например файл
// 2.Класс File-абстрактная репрезентация пути к файлу или папке.
// 3.Класс FileInputStream предназначен для создания потока, с помощью которого можно читать информацию из источника.
// 4.Класс FileOutputStream предназначен для создания потока, с помощью которого можно писать информацию в источник.
// 5.Конструкторы классов FileInputStream и FileOutputStream могут выбрасывать исключение FileNotFoundException;
// 6.Методы read и write классов FileInputStream и FileOutputStream могут выбрасывать исключение IOException.

import java.io.*;

public class Java_io_File {
    public static void main(String[] args) throws Exception{
        File f=new File("Test112.txt");
        FileInputStream fm=new FileInputStream(f);
        System.out.println(fm.read());
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(100);
    }
}
