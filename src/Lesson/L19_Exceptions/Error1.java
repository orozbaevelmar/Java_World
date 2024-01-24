package Lesson.L19_Exceptions;

// Error-это очень серьезные ошибки,  которые не могут быть напрямую контролированны вашей программой
// Error-ы могут быть обявленны,но обявлять error-ы считается глупой практикой. Некоторые error-ы могут быть обработаны, но
//               это тоже будет очень глупой затеей. Error-ы, как и runtime исключения считаются unchecked.
// Error subKlass--> 1)ExceptionInitializerError(parent:LinkageError); 2)StackOverFlowError(parent:VirtualMachineError)
//                   3)OutOfMemoryError 4)NoClassDefFoundError
//
public class Error1 {
    static void abc(){ //StackOverflowError
        System.out.println("Rabotaet method abc");
        abc();
    }
// -1-
    /*static{
        int a=Integer.parseInt("12e"); //NumberFormatException
    }*/

//    static String s=def();
//    static String def(){
//        String [] array={"1","2","3"};
//        return array[100]; //ArrayIndexOutOfBoundsException
//    }

    /*static String s=null;
    static int a=s.length();*/ //NullPointerException




    public static void main(String[] args) {
        /*try{
            abc();
        }
        catch(StackOverflowError e){
            System.out.println("Error poiman");
        }*/

        Error1 e=new Error1();
        e.jkl();

    }
    void ghi(){
        System.out.println("method ghi");
        throw new StackOverflowError();
    }
    void jkl(){
        try{
            ghi();
            return;
        }finally{
            System.out.println("Eto finally block");
        }
    }

}
