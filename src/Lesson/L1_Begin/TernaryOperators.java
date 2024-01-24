package Lesson.L1_Begin;

public class TernaryOperators {
    public static void main(String[] args) {
        int i=7;
        System.out.println(i < 2 ? 6 : 9);
        System.out.println(i<5 ? 3 : 6);
        System.out.println(i < 2 ? i < 5 ? 3:6:9); // работает else
        System.out.println(i > 2 ? i < 5 ? 3:6:9); // из- за того что 7>2 переходим на следующую уравнению, 7<5 false (6) else работает
        System.out.println(i > 2 ? i > 5 ? 3:6:9); // 7>5 работает if

        int number = 24;
        String result = (number > 0) ? "Positive Number" : "Negative Number";
        System.out.println(result);

        int n1 = 2, n2 = 9, n3 = -11;
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number: " + largest);

        System.out.format("key: %s, value: %d%n", 2, 3);
        System.out.format("key: %d%n, value: %s", 1,2);


        System.out.println("\n");
        int g=3;
        System.out.println((g<4) ? 7 : "privet");

        System.out.println();
        int a=5, b=5;
        int c=(a<6) ? a++ : b++ ;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
