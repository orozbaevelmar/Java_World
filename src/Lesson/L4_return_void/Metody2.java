package Lesson.L4_return_void;

public class Metody2 {
    public static void main(String[] args) {
       int temp=abc(10,22);
        System.out.println("Result is: " + temp);
    }
    public static int abc(int a, int b){
       int def;
       def=b/a;

       return def;
    }
}
