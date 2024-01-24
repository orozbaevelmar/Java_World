package Lesson.L4_return_void;

public class Void2_arr {
    public static void main(String[] args) {
        int[] mas=new int[]{1, 2, 3};
        multiElement(new int[]{1, 2, 3}, 2);// так тоже можно, но потом мы не можем к этому ссылку обращаться!

        multiElement(mas, 2);
        for (int j=0; j<mas.length; j++){
            System.out.print(mas[j]+", ");
        }
    }
    public static void multiElement(int[] arr, int value){
        for (int i=0; i<arr.length; i++){
            arr[i]*=value;
        }
    }
}
