package Lesson.L14_Encapsulation_Inheritance;

// Сокрытие данных
// Сокрытие данных, защита от нежелательного вмещательства, помещение их в "капсулу".
// Характеризуется private переменными и public методами get и set которые нередко проверяют какие-либо условия.
// Если return type метода get - это mutable тип данных, то лучше возвращать его копию. ( EX: StringBuilder )
public class Encapsulation {
    public static void main(String[] args) {
        Person person1=new Person("Male");
        person1.setName("Askar");
        person1.setAge(18);
        person1.setWeight(60);
        person1.setClever(false);

        System.out.println("Sex:"+ person1.sex+"   name:"+person1.getName()+"   age:"+ person1.getAge()+"   weight:"+ person1.getWeight()+"   clever:"+ person1.isClever());

        Person person2=new Person("Female");
        person2.setName("Gul");
        person2.setAge(-18);
        person2.setWeight(50);

        System.out.println("Sex:"+ person2.sex+"   name:"+person2.getName()+"   age:"+ person2.getAge()+"   weight:"+ person2.getWeight());

        MutableType pers=new MutableType();
        pers.setName(new StringBuilder("Bek"));
        pers.getName().append("!!!");
        System.out.println(pers.getName());
    }
}
class Person{
    final String sex;
    Person(String sex){
        this.sex=sex;
    }
    private String name;
    private int age;
    private int weight; //ves
    private boolean clever;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age>0) this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setWeight(int weight) {
        if (weight>0) this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isClever() {
       return clever;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }
}

class MutableType{
    StringBuilder name;

    public void setName(StringBuilder name) {

        this.name = name;
    }
    public StringBuilder getName(){
        StringBuilder ab=new StringBuilder(name);
        return ab;
    }
}