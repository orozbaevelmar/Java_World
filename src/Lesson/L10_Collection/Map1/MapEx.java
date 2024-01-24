package Lesson.L10_Collection.Map1;

import java.util.*;

// В основе HashMap лежит массив. Элементами данного массива являются структуры LinkedList и заполняются элементами, которые мы добавляем в HashMap.
// При создании HashMap мы можем задать 2 параметра, которые очень влияют на производительность:
//      a)Initial capacity-начальный размер массива;
//      b)Load factor - коэффициент того, насколько массив должен быть заполнен, после чего его размер будет увеличен вдвое.
//

class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>(16, 0.75f);

    }
}
