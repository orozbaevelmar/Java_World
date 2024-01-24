package Lesson.L2_Loop_Case;

public class WhileCickl {
    public static void main(String[] args) {
        int i=1;     // Выполнется если условие ВЕРНО, Если напишем i=16, то мы не вошли бы в цикл.
        while (i < 4) {
            //System.out.println("Element i is =" + i);
            i++;
            System.out.println(i);
        }
        System.out.println(i);
    }
}
