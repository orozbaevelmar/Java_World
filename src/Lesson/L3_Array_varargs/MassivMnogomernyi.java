package Lesson.L3_Array_varargs;

public class MassivMnogomernyi {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                // индекс   0    1   2   3
                {10, 11, 12, 13},     //0 индекс ПЕРВЫМИ СЧИТАЕТСЯ
                {20, 21, 22, 23},     //1 индекс
                {30, 31, 32, 33},}; //2 индекс
        System.out.println("До изменения: " + arr[0][0]);
        arr[0][0] = 32;
        System.out.println("После изменения: " + arr[0][0]);

        int[][] arr5 = new int[3][]; //так можно писать, из-за того что они не равны [3] [{3,1,4}]
//                        {{10, 11, 12},
//                        {20},
//                        {30, 31, 32, 33}};
        arr5[0]=new int[3];
        arr5[1]=new int[1];
        arr5[2]=new int[4];


        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }


// трехмерный массив
        int[][][] array=new int[][][]{{{1,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}};
        System.out.println("\nthree dimensional array="+array[1][2][0]);

        int[][] arr8=new int[][]{{1,2},{3,4},{5,6}};
        int[] arr9={8,9};
        arr8[1]=arr9;
        System.out.println(arr8[1][0]+"  "+arr8[1][1]);
    }
}
