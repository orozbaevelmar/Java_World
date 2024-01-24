package Lesson.L1_Begin;

public class IfAndOrXor {
    public static void main(String[] args) {
        int i = 123, j = 45;

        if (i == 122 && j == 45) System.out.println("i is not 234");


        else if (i < 100 || j > 50) {
            System.out.println("i is not 100");
        } else {
            System.out.println("i is unknown"); //���� ���� ��������� �������� �� �����������, �� ���������� ���
        }
// (XOR) ^ (Логическая исключающее (или)) Если только одна из них TRUE то выдаст TRUE,в остальных случаях False
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = true;
        System.out.println("\n(XOR)  ( ^ )");
        System.out.println(b1 ^ b2 ^ b3 ^ b4);
        System.out.println(b1 ^ b2 ^ b3);


    }
}
