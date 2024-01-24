package Lesson.L4_return_void;

public class Person8 {
    int height;
    float weight;

    public void say(String str) {
        System.out.println(str);
    }
    Person8 (int height, float weight){ //Public ����� ������, � �� ������
        this.height=height;
        this.weight=weight;
    }
    Person8() {} //�����������
}
