package Lesson.L5_Overloading;

public class OverloadingMit_Void {
    public void show(int i1){
        System.out.println(i1);
    }
    /*void show(int i2){         // в show методе не можем создать двух int
        System.out.println(i2);  // потому что компилятор не может кого мы именно вызываем
    }*/                          // поэтому java не позволяет создавать двух с одинаковым названием
    void show(boolean b1){
        System.out.println(b1);
    }
    void show(String s1){
        System.out.println(s1);
    }
}
class TestOverloading{
    public static void main(String[] args) {
        OverloadingMit_Void mo=new OverloadingMit_Void();
        int a=500;                // здесь он может запутаться!
        mo.show(a);
        boolean b=true;
        mo.show(b);
        String s="Bek";
        mo.show(s);
        int a1=213;
        mo.show(a1);
    }
}
