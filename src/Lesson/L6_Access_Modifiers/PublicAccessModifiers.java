package Lesson.L6_Access_Modifiers;

// Public--> alle packages, classes.

public class PublicAccessModifiers {
    public double salary;

    public void dvoinayaZP(){
        System.out.println("Двойная зарплата="+salary*2);
    }

    public PublicAccessModifiers(double salary2){
        salary=salary2;
        System.out.print("Зарплата=");
    }

    public static void main(String[] args) {
        PublicAccessModifiers employee=new PublicAccessModifiers(500);
        System.out.println(employee.salary);
        employee.dvoinayaZP();
    }
    
}
class AccesModifiersTest{
    public static void main(String[] args) {
        PublicAccessModifiers employee=new PublicAccessModifiers(500);
        System.out.println(employee.salary);
        employee.dvoinayaZP();
    }
}


