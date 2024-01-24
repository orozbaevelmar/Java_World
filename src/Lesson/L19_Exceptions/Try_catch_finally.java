package Lesson.L19_Exceptions;

// Несколько catch блоков могут следовать за try блоком, но лишь 1 finally блок может следовать за catch блоками
// Одновременно вы можете использовать все 3 типа блоков или по 2:try блок с catch блоком/ами; try блок с finally блоком.
//                                                                      По отдельности блоки использовать невозможно
// Последовательность блоков всегда должна соответствовать следующему порядку: try-->catch-->finally
// Finally блок выполняется вне зависимости от того выбросилось исключение или нет.


public class Try_catch_finally {
    public static void main(String[] args) {
        int[] array={4,8,1};
        System.out.println("U nas est massiv");
        try {
            System.out.println(array[10]);
            System.out.println("Vsem horoshego dnya!");
        }
        catch (ArrayIndexOutOfBoundsException e){System.out.println("Byl poiman exception:  "+e);}
        finally{System.out.println("Eto finally block ");}
        System.out.println("Dannyi kod uje ne imeet otnoshenie k Isklucheniyam");

        System.out.println();
        try {
            System.out.println(array[10]);
            System.out.println("How are you?");
        }// если так сделать то catch не будет работать (NullPointerException не правильно)
        catch (NullPointerException p){System.out.println("Byl poiman exception:  "+p);}
    }
}
