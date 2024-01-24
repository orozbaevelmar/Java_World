package Lesson.L16_Stream_Interface;

// 1.Method chaining (цепочки) - общее название синтаксиса в ООП, в котором несколько методов вызываются один за другим.
// 2.Работа метод Chaining в Stream
//   [a]Source(Z.B=Collection, arrays) ---(elements)-->[b] Intermediate methods(lazy) ---(elements)--> [c] Terminal method(eager)
//   b==filter(i), map(i), sorted(i)    -->возвращают stream(после этих методов можно использовать методы Intermediate и Terminal methods)
//   c==reduce(t), forEach(t), collect() -->возвращают void(нельзя дальше вызвать Intermediate methods)

//   b==distinct(i)
//   c==count(t)
import java.util.Arrays;

public class ChainingMethod {
    public static void main(String[] args) {
        int[] array={3,8,1,5, 9,12,4,21,81,7,18};
        int result= Arrays.stream(array).filter(x->x%2!=0).
                map(x->{ if (x%3==0) return x/=3;
                         else return x; // x%3==0 ? element/3 : element
        }).reduce((res, ind)->res+ind).getAsInt();
        System.out.println(Arrays.toString(array));
        System.out.println(result);
        //[3, 1, 5, 9, 21, 81, 7] filter
    }
}
