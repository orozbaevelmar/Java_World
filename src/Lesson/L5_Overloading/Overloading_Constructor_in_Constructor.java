package Lesson.L5_Overloading;

public class Overloading_Constructor_in_Constructor {
    public static void main(String[] args) {
        Employee emp=new Employee(2, "Bekov", 25);
        System.out.println(emp.id+" "+emp.surname+" "+ emp.age);

        Employee abc=new Employee(4, "Manasov", 37, 25000, "Police");
    }
}
class Employee{
    Employee(int id2, String surname2, int age2){
        this (surname2, age2); // Используйте "this" на первой строке в теле для вызова overloaded конструктора
        id=id2;                // внутри конструктора
    }
    Employee(String surname3, int age3){
        surname=surname3;
        age=age3;
    }
    Employee(int id4, String surname4, int age4, double salary4, String department4){
        this (id4, surname4, age4);
        salary=salary4;
        department=department4;
        System.out.println(id+" "+ surname+" "+age+" "+salary+" "+department);
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
}