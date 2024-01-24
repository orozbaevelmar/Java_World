package Lesson.L6_Access_Modifiers;

// Default-->ТОЛЬКО внутри ПАКЕТА!!!

public class DefaultAccesModifiers {
    double salary;

     void dvoinayaZP(){
        System.out.println("Двойная зарплата="+salary*2);
    }
     DefaultAccesModifiers(double salary2){
        salary=salary2;
         System.out.print("Зарплата=");
    }

     public static void main(String[] args) {
        DefaultAccesModifiers employee=new DefaultAccesModifiers(500);
        System.out.println(employee.salary);
        employee.dvoinayaZP();
    }
}
