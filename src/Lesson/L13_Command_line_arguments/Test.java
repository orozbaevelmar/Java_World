package Lesson.L13_Command_line_arguments;

public class Test {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args.length);
    }
}
// сохраняем под именем класса.java (Test.java)
// Win, напишем cmd(командная строка)
// находим где расположен JDK (у меня C:/Users/user/.jdks/openjdk-18.0.1.1/bin  ( / не в эту сторону, а в протиположном направлении )
// в командную строку напишем set path=C:/Users/user/.jdks/openjdk-18.0.1.1/bin
// D:
// cd  и имя папки(PR)    (cd PR)
// javac имя текстового имени.java ( javac Test.java )
// java Test 10 7 8 5
// 10      //args[0]
// 4      //args.length

// String args [] = {"10", "7", "8", "5"};
// Data Type is String
