package Lesson.L17_Polymorphism_Instanceof_Casting;

// Это конвертация меньшего численного типа данных в больший
// в след.случаях:
// Если имеються 2 значения разных типов данных, Java автоматически конвертирует меньший числовой тип данных в больший
// Если одно из значений-это целое число, а другое дробное, Java автоматически конвертирует целочисленный тип данных в дробный.
// Если значение типов данных byte, short и char участвуют в арифметических операциях, то они перед этим конвертируется в тип
// данных int, даже если в данных арифетических операциях значение типа данных не участвует.
//      Исключение:Унарные операторы. Использование ++ к типу данных byte не конвертирует результат оператора в int
//
// 1.29.25
public class NumericPromotion {
    public static void main(String[] args) {
        int i=5;
        long l=10;
        System.out.println(i+l);
        /* i=i*l;   Wrong*/
        i=(int)(i*l);
        i=i*(int)l;
        i*=l; //Right

    }
}