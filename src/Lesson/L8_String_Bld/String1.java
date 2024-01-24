package Lesson.L8_String_Bld;

public class String1 {
    public static void main(String[] args) {
        char [] arrChar=new char[]{'k','a','n','d','a','i'};
        String str=new String(arrChar);
        System.out.println(str);
        System.out.println(String.valueOf(arrChar));
// charAt(index)-->char
// contains('a')-->boolean
// endsWith(Sting suffix)-->boolean
// equals(Object anobject)-->boolean
// indexOf("a")-->int
// lastIndexOf("b")-->int
// isEmpty()-->boolean
// length()
// replace(char old, char new)-->String
// replaceAll(String regex, String replacement)
// startsWith(String regex)-->boolean
// substring(int beginIndex)-->String
// toCharArray()
// toLowerCase()
// toUpperCase()
// toString()
// valueOf()

        String s1 = "Javatpoint";
        String s2 = s1.intern();
        String s3 = new String("Javatpoint");
        String s4 = s3.intern();
        System.out.println(s1==s2); // True
        System.out.println(s1==s3); // False
        System.out.println(s1==s4); // True
        System.out.println(s2==s3); // False
        System.out.println(s2==s4); // True
        System.out.println(s3==s4); // False
    }
}
