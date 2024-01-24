package Lesson.L10_Collection.MethodsCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Collections.binarySearch(list, element) -->возвращает индекс элемента,если не найден возвращается отрицательное число

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-4);
        list.add(5);
        list.add(7);
        list.add(26);
        list.add(2523);
        list.add(732);
        list.add(0);
        list.add(1);
        list.add(19);
        list.add(100);
        Collections.sort(list);
        int index1=Collections.binarySearch(list, 100);
        System.out.println(list);
        System.out.println("index1 = "+index1);
        System.out.println(Collections.binarySearch(list,-432));


        Employee emp1=new Employee(100, "Aktan", 12345);
        Employee emp2=new Employee(14, "Bek", 35422);
        Employee emp3=new Employee(14, "Emil", 65326);
        Employee emp4=new Employee(73, "Talant", 43677);
        Employee emp5=new Employee(15, "Eldar", 12462);
        Employee emp6=new Employee(83, "Chyngyz", 100000);
        Employee emp7=new Employee(36, "Salamat", 79300);

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index5=Collections.binarySearch(employeeList, new Employee(15, "Eldar", 12462));
        int index6=Collections.binarySearch(employeeList, new Employee(15, "Eldar", 0));
        System.out.println("index5 = "+index5+",  index6 = "+index6);

        int [] array={6,2,6,-6,14,-87,47,33};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index8=Arrays.binarySearch(array, 14);
        System.out.println("int [] array= "+ index8);
    }
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(Employee anotherEmployee){
        int result=this.id-anotherEmployee.id;
        if (result==0){
            result=this.name.compareTo(anotherEmployee.name);
        }
        return result;
    }
}
