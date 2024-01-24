package Lesson.L4_return_void;

public class Return_Array {
    public static void main(String[] args) {
        int [] mas=new int[]{1,2,3};
        int [] mas1=new int[]{4,5,6};
        for (int i: combineArrays(mas, mas1)){
        System.out.print(i+", ");
        }
    }
    public static int[] combineArrays(int[] a, int[] b){
        int[] c=new int[a.length+b.length];

        for (int i=0; i<a.length; i++){
            c[i]=a[i];
        }
        int j=0;

        for (int i= a.length; i< c.length; i++){
            c[i]=b[j];
            j++;
        }
        return c;
    }
}
