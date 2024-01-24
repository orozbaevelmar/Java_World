package Lesson.L23_Comparable_Comparator_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 1.Интерфейс Comparable используеться для сравнения объектов, используеться естественный порядок
//   int compareTo(Element e)

public class ComparableEx2 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        Employee emp1=new Employee(100, "Tilek", "Atashov",20000);
        Employee emp2=new Employee(53, "Asyl", "Temirov",25000);
        Employee emp3=new Employee(100, "Belek", "Sakeev",31000);
        Employee emp4=new Employee(83, "Myky", "Chyngyzov",43000);
        Employee emp5=new Employee(1, "Tilek", "Sagynbaev",72900);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println("Before comparison : \n"+list);
        Collections.sort(list); // Compiler swears without Comparable
        System.out.println("---------------------");
        System.out.println("After comparison : \n"+list);
        System.out.println("---------------------");

        Employee[] empArr=new Employee[]{emp1,emp2,emp3,emp4,emp5};
        Arrays.sort(empArr); // need Comparable too
        System.out.println("empArr : \n"+Arrays.toString(empArr));


    }
}
class Employee implements Comparable<Employee>{
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}'+"\n";
    }


    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id==anotherEmp.id) return 0;
        else if(this.id<anotherEmp.id) return -1;
        else return 1;

// 1.       return this.id-anotherEmp.id;

// 2.       return this.id.compareTo(anotherEmp.id);       // if "id" is Integer (because reference)
// 3.       return this.name.compareTo(anotherEmp.name);   // by name

/* 4.       int res=this.name.compareTo(anotherEmp.name);  // if name fail, then surname
            if (res==0) {
                res=this.surname.compareTo(anotherEmp.surname);
            }
            return res;
*/
    }
}
