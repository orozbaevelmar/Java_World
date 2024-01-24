package Lesson.L21_Lambda_var;

//var-вывод

import java.util.ArrayList;

public class LocalVariableTypeInference {
    /*  WRONG  var v=10;*/
    public static void main(String[] args) {
        var tit=new TestInferenceType();
        var i=10;
        var w=1.5f;
        var array=new String[]{"a","b"};
        var result=abc();
        Object obj1="privet";
        var obj2=obj1;
        ArrayList<String> list=new ArrayList<>();
        for (var s:list){
            System.out.println(s);
        }
        /* WRONG var h;*/
        /* WRONG var n= null;*/
        /* WRONG var array2={1,2};*/
        /* WRONG var[] array3={1,2};*/

        var var="var";


    }
    static double abc(/* WRONG var a*/){return 3.14;}
    /* WRONG static var def(){return 5;}*/
}
class TestInferenceType{}
