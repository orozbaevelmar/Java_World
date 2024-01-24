package Lesson.L21_Lambda_var;

// def (  ()->5  );
// def  ( (x)->x.length() );
// def ( (String s)->s.length() );
// def ( (x,y)->x.length() );
//

public class Lambda5 {
    static void def0(Test10 t){
        System.out.println(t.abc("privet"));
    }
    static void def1(Test11 t){
        System.out.println(t.xyz());
    }
    static void def2(Test12 t){
        System.out.println(t.abc("privet", "poka"));
    }

    public static void main(String [] args){
        def0(x->x.length());
        System.out.println("-----------");
        def1(()->5);
        System.out.println("-----------");
        def2((s1,s2)->s1.length());
    }
}
interface Test10{
    int abc(String s);
}
interface Test11{
    int xyz();
}
interface Test12{
    int abc(String s1, String s2);
}