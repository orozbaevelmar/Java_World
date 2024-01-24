package Lesson.L2_Loop_Case;

public class ForEach {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        for (long arr5:arr){
            System.out.print(arr5+" ");
        }System.out.println(" ����������\n");


        int[][] array= {{0, 2, 6, 4},{0,1,3,4},{9,3}};
        for (int []array5:array){
            for (int array8:array5){
                System.out.print(array8+" ");
            }
            System.out.println();
        }System.out.println("����������� \n");


        String[] students={"Aktan", "Bek", "Akyl"};
        String[] exams={"math", "chemistry"};
        for (String st:students){
            for (String ex:exams){
                System.out.println(st+" "+ex);
            }
        }System.out.println();


        String[] massiv={"Privet", "Poka", "Ok"};
        for (String mass:massiv){
            mass=new String("Hello");
        }
        for (int i=0; i<massiv.length; i++){
            System.out.print(massiv[i]+"   ");
        }System.out.print("     (��� String ������ ��������)\n\n");


        StringBuilder sb1=new StringBuilder("Privet");
        StringBuilder sb2=new StringBuilder("Poka");
        StringBuilder sb3=new StringBuilder("Ok");
        StringBuilder[] sb={new StringBuilder("Hi"),sb1,sb2,sb3};
        for (StringBuilder sb5:sb){
            //sb5.delete(0,sb5.length());
            sb5.append(" Java");
        }
        for (int i=0; i<sb.length; i++){
            System.out.print(sb[i]+"   ");
        }System.out.print("     (��� StringBuilder ����� ������ ������ ��������)\n\n");
    }
}
