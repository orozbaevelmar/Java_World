package Lesson.L4_return_void;

public class Void3 {
    public static void main(String[] args) {
        //int[] mas=new int[]{2, 3, 4};
        multiElement5(new int[]{2, 3, 4}, 2);
    }
    public static void multiElement5(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=value;
            System.out.print(arr[i] + ", ");
        }
    }
}
