package CodeForces.Level_A;
import java.util.Scanner;
public class A734 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int j = num.nextInt();
        String s;
        int k = 0;
        int k1 = 0;
        char c = 'A';
        char c1 = 'D';
        s=num.nextLine();
        s = num.nextLine();
        for (int i = 0; i < j; i++) {
                char EverySymvol = s.charAt(i);
                if (c == EverySymvol) {
                    k++;
                }
                else if (c1==EverySymvol)
                    k1++;
                }
        if (k > k1) {
            System.out.print("Anton");
        } else if (k < k1) {
            System.out.print("Danik");
        } else
            System.out.print("Friendship");
    }
}

           /* String exampleString = "This is just a sample string";

            int totalCharacters = 0;
            char temp;
            for (int s = 0; s < exampleString.length(); s++) {

                temp = exampleString.charAt(s);
                if (temp == 's')
                    totalCharacters++;
            }
            System.out.println("i appears " + totalCharacters + " times in exampleString");*/








