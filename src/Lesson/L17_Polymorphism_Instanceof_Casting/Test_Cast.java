package Lesson.L17_Polymorphism_Instanceof_Casting;

public class Test_Cast implements it1,it2 {
    public void abc(){
        System.out.println("dfs");
    }
    public static void main(String[] args) {
        Test_Cast c=new Test_Cast();

        System.out.println(((it2)c).a);
    }
}
interface it1{
    int a=5;
    void abc();
}
interface it2{
    int a=10;
    void abc();
}