package Lesson.L21_Lambda_var;

import java.util.ArrayList;
import java.util.function.Predicate;
public class TestEmployee {
    void printEmployee(Employee emp){
        System.out.println("Name: "+emp.name+",  department: "+emp.department+",  salary: "+emp.salary);
    }
    void filtrEmployees(ArrayList<Employee> list, Predicate <Employee> employeePredicate){
        for (Employee emp:list){
            if (employeePredicate.test(emp)){
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        Employee emp1=new Employee("Bek", "Police", 60000);
        Employee emp2=new Employee("Bolot", "Doctor", 70000);
        Employee emp3=new Employee("Temir", "Teacher", 80000);
        Employee emp4=new Employee("Aibek", "Programmer", 100000);
        Employee emp5=new Employee("Erjigit", "Engineer", 55000);

        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        TestEmployee t=new TestEmployee();
        t.filtrEmployees(empList, a->a.department.equals("Programmer") && a.salary>200);
        System.out.println("------------------------");
        t.filtrEmployees(empList, a->a.name.startsWith("T") && a.salary!=450);
        System.out.println("------------------------");
        t.filtrEmployees(empList, a->a.name.startsWith(String.valueOf(a.department.charAt(0))));
    }
}
class Employee{
    String name;
    String department;
    int salary;
    Employee(String name, String department, int salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
}

