package Lesson.L12_Method_CallUp;

public class Employee {
    String name;
    double salary;
    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public double uvelichitel(double a){
        return a*=2;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp=new Employee("Chyngyz", 500.1);
        double DvZp=emp.uvelichitel(emp.salary);
        System.out.println(DvZp);
        System.out.println(emp.salary);
    }
}