package Lesson.L23_Comparable_Comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 1.Интерфейс Comparator используеться для сравнения объектов, используя НЕ естественный порядок
//   Z.B String implements Comparable(если хотим отсортировать наоборот нужно c Comparator)(или хотим по length() отсортировать)
//  int compare(Element e1, Element e2)

public class ComparatorEx1 {
    public static void main(String[] args) {
        List<Employee12> list=new ArrayList<>();
        Employee12 emp1=new Employee12(100, "Tilek", "Atashov",20000);
        Employee12 emp2=new Employee12(53, "Asyl", "Temirov",25000);
        Employee12 emp3=new Employee12(100, "Belek", "Sakeev",31000);
        Employee12 emp4=new Employee12(83, "Myky", "Chyngyzov",43000);
        Employee12 emp5=new Employee12(1, "Tilek", "Sagynbaev",72900);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println("Before comparison : \n"+list);
        Collections.sort(list, new NameComparator()); // Compiler swears without Comporator
        System.out.println("---------------------");
        System.out.println("After comparison : \n"+list);


    }
}

class Employee12{
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee12(int id, String name, String surname, int salary) {
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
}


class IdComparator implements Comparator<Employee12> {
    @Override
    public int compare(Employee12 emp1, Employee12 emp2){
        if (emp1.id==emp2.id) return 0;
        else if(emp1.id<emp2.id) return -1;
        else return 1;
    }
}
class NameComparator implements Comparator<Employee12> {
    @Override
    public int compare(Employee12 emp1, Employee12 emp2){
        return emp1.name.compareTo(emp2.name);
    }
}
class SalaryComparator implements Comparator<Employee12> {
    @Override
    public int compare(Employee12 emp1, Employee12 emp2){
        return emp1.salary-emp2.salary;
    }
}
