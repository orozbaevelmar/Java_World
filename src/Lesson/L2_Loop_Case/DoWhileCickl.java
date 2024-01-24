package Lesson.L2_Loop_Case;
public class DoWhileCickl {
    public static void main(String[] args) {
       int i=0;
       int k=0;
         do {
            i+=3;
            k++;
        } while (i<-1);
        System.out.println("Element i is:" +i);
        System.out.println(k);
    }
}

/*Даже если условие не верно,все рано все выполнится. После этого условие проверяется,если условие неверно,
то мы не можем войти в цикл повторно. Но один раз оно выполнится.
       int i=100;
        do {
            System.out.println("Element i is:" +i);
        } while (i<10);

        ОТВЕТ:  Element i is:100
*/