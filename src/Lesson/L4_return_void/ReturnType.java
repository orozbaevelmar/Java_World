package Lesson.L4_return_void;

public class ReturnType {
    int sum(int i1, int i2){
        return i1+i2;
    }

    String sum(String s1, String s2){
        return s1+s2;
    }
}
class Test2{
    public static void main(String[] args) {
        ReturnType rt=new ReturnType();
        int ost=rt.sum(1, 2);
        System.out.println(ost);

        String ost1=rt.sum("Hallo ", "Bob");
        System.out.println(ost1);
    }
}
