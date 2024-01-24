package Lesson.L6_Access_Modifiers;

//Private-->только внутри класса PrivateAccessModifiers ВИДНО!!!

public class PrivateAccessModifiers {
    private double salary;

    private void dvoinayaZP(){
        System.out.println("Двойная зарплата="+salary*2);
    }
    private PrivateAccessModifiers(double salary2){
        salary=salary2;
        System.out.print("Зарплата=");
    }

    public static void main(String[] args) {
        PrivateAccessModifiers employee=new PrivateAccessModifiers(500);
        System.out.println(employee.salary);
        employee.dvoinayaZP();
    }
}
//Здесь его не будет видно!!!

/*class AccesModifiersTest{
    public static void main(String[] args) {
        PrivateAccessModifiers employee=new PrivateAccessModifiers(500);
        System.out.println(employee.salary);
        employee.dvoinayaZP();
    }
}*/
