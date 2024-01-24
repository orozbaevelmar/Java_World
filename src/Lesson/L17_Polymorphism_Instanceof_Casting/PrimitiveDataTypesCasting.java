package Lesson.L17_Polymorphism_Instanceof_Casting;

// byte to (short, int, long, float or double)
// short to (int, long, float or double)
// char to (int, long, float or double)
// int to (long, float or double)
// long to (float or double)
// float to(double)

// Narrowing without casting происходит, если выполняются 3 условия:
//      1.если int cast-ится в byte, short, char
//      2.если значение int-это константа
//      3.если значение int помещается в соответствующий тип данных

public class PrimitiveDataTypesCasting{
    public static void main(String[] args) {
        byte b1=10; // 1.
        int b2=b1;

        final int a=2; // 2.
        short sh= a;
// 22 forms of narrowing:
// short to (byte or char)
// char to (byte or short)
// int to (byte, short or char)
// long to (byte, short, char or int)
// float to (byte, short, char, int or long)
// double to (byte, short, char, int, long or double)
        int i1=10;
        byte b5=(byte)i1;
    }
}
