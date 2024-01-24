package Lesson.L2_Loop_Case;

public class SwitchCaseCickl {
    public static void main(String[] args) {
        int num=23;
        switch(num) {
            case 12:
                System.out.print("num is 12");
                break;

            case 15:
                System.out.println("num is 15");

            case 30:
                System.out.print("num is 30");
                break;

            case 23:
                System.out.println("num is 23");
                if (num==23)
                    System.out.print("All is ok!");
                break;

            default:
                System.out.println("Num is unknown");
        //���� CASE �� ����������, �� �������������� DEFAULT, � �� ����� BREAK (�������)
        }
    }
}
