package Lesson.L2_Loop_Case;
public class DoWhileCickl {
    public static void main(String[] args) {
       int i=0;
       int k=0;
         do {
            i+=3;
            k++;
        } while (i<-1);
        System.out.println("Element i is:" +i);
        System.out.println(k);
    }
}

/*���� ���� ������� �� �����,��� ���� ��� ����������. ����� ����� ������� �����������,���� ������� �������,
�� �� �� ����� ����� � ���� ��������. �� ���� ��� ��� ����������.
       int i=100;
        do {
            System.out.println("Element i is:" +i);
        } while (i<10);

        �����:  Element i is:100
*/