package Lesson.L7_Non_Access_Modifiers;

//length, charAt(), substring(int beginIndex, int endIndex)
// indexxOf(String s, int fromIndex) (ohne char)
// subsequence (int start, int end) --->CharSequence  (wie sunbstring)
// append(dataType dt) --->StringBuilder
// insert(int toIndex, dataType dt) --->StringBuilder
// delete(int start, int end) --->StringBuilder
// deleteCharAt(int i) --->StringBuilder
// reverse() --->StringBuilder (поворочивает)
// replace(int start, int end, String s) --->StringBuilder
// capacity() --->int  (by default 16)


public class StringBuilderMethod {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("123"); //didn't created new Object
        StringBuilder sb2=sb1.append("45");
        sb2=sb2.append("6").append("7");
        System.out.println("sb1="+sb1);
        System.out.println("sb2="+sb2);
    }
}
