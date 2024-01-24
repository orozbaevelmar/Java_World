package Lesson.L25_Scanner;

import java.util.Scanner;

// Scanner sc=new Scanner(System.in); --> Work with console;
// nextByte();
// nextShort();
// nextInt();
// nextLong();
// nextFloat();
// nextDouble();
// nextBoolean();

// next();
// nextLine();

// hasNext();
// hasNextLine()
// hasNextInt()

public class ScannerEx1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number");
        int i=scanner.nextInt();
        System.out.println("Entered number = "+i);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println("Chastnoe = "+x/y);

        System.out.println("--------------------");
        System.out.println("write the line");
        String s1=scanner.nextLine();
        System.out.println("You wrote the first line = "+s1);

        System.out.println("--------------------");
        System.out.println("write the line");
        String s5=scanner.next(); // The weather is beautifull // Answer: The
        System.out.println("You wrote the first line = "+s5);

        System.out.println("--------------------");
        Scanner scanner1=new Scanner("Hi my friend");
        String str1=scanner1.next();
        System.out.println(str1);

        System.out.println("--------------------");
        Scanner scanner2=new Scanner("Hi my friend! \n How are you? \n Is there any news?");
        /*String str2=scanner1.nextLine();
        System.out.println(str2);
        System.out.println(scanner2.nextLine());
        System.out.println(scanner2.nextLine());*/
        while(scanner.hasNextLine()){
            System.out.println(scanner2.hasNextLine());
        }

        System.out.println("--------------------");
        System.out.println(scanner.next().charAt(0));

    }
}
