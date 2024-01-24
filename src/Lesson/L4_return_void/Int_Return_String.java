package Lesson.L4_return_void;

public class Int_Return_String {
    public static void main(String[] args) {
// RETURN STRING
        System.out.print("LEN (ABCDE)=");
        System.out.println(getStrLength("ABCDE"));
        int len10=getStrLength("ABCD");
        System.out.println("String len (ABCD)="+len10+" \n");
//

// RETURN INTEGER
        ReturnInt ab=new ReturnInt();
        int summaTrechChisel=ab.summa(1,2,3);
        System.out.println("summaTrechChisel="+summaTrechChisel);
        System.out.println("Summa="+ab.summa(5, 10, 5));
//

    }
    public static int getStrLength(String str){
            int len = str.length();
            return len;

    }
}
class ReturnInt{
    int summa(int a, int b, int c){
        int result =a+b+c;
        return result;
    }
}

