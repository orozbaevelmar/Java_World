package Lesson.L8_String_Bld;

// length() ---->int
// charAt(i) --->char
// indexOf("a" ODER 'a')   indexOf('H', 5)  --->int
// startsWith("fsdf", UND  5)-->boolean
// endsWith("dsf") --->boolean
// substring (int beginIndex, int endIndex) --->Sring
// trim () --->String (убирает пробелы по бокам)
// replace(oldChar, newChar) replace(oldString, newString)--->String
// concat(String str)--->String  ODER (str+str1)
// toLowerCase() ---> String
// toUpperCase() ---> String
// contains(Sting s) --->boolean
// equals(str); --->boolean
// equalsIgnoreCase(str); --->boolean
// isBlank() --->boolean   (checks if a String is whitespace, empty ("") or null)
// isEmpty() --->boolean   (checks if a String is empty (""))
// strip  stripLeading  stripTrailing (arbeit als trim()


public class StringMethod {
    public static void main(String[] args) {
        String s="HabcdefgHi";

        System.out.println(s.indexOf("H"));
        System.out.println(s.indexOf('H', 5));

        System.out.println(s.startsWith("Hab")+"\n");

        String s2=s.substring(5, 7);
        System.out.println(s2+"\n");

        String replaceS=s.replace("gHi", "a");
        System.out.println(replaceS+"\n");

        String conc="kak";
        String conc1="dela";
        String concatS=conc.concat(conc1);
        System.out.println(concatS);
        System.out.println(5+6+conc);
        System.out.println(""+5+6+conc);
        System.out.println(""+(5+6)+conc+"\n");


        String letter1="Privet";
        String letter2="privet";
        System.out.println(letter1.equals(letter2));
        System.out.println(letter1.equalsIgnoreCase(letter2)+"\n");

        String blank="dsf";
        System.out.println(blank.isBlank());
        String blank1="  ";
        System.out.println(blank1.isBlank()+"\n");

        String empty="";
        System.out.println(empty.isEmpty());
    }
}
