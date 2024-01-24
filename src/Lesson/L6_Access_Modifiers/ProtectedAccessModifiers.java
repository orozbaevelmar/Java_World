package Lesson.L6_Access_Modifiers;

// Protected-->Внутри пакета(тоесть DEFAULT) + И в других пакетах в которые являются детьми ProtectedAccessModifiers

public class  ProtectedAccessModifiers {
    protected double salary;

    protected void dvoinayaZP(){
        System.out.println("Двойная зарплата="+salary*2);
    }
    protected ProtectedAccessModifiers(double salary2){
        salary=salary2;
        System.out.print("Зарплата=");
    }

    public static void main(String[] args) {
        ProtectedAccessModifiers employee=new ProtectedAccessModifiers(500);
        System.out.println(employee.salary);
        employee.dvoinayaZP();
    }
}
