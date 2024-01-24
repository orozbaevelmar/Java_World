package Lesson.L10_Collection.List1;

import java.util.Stack;

// push
// pop
// peek
// isEmpty
public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");
        System.out.println("peek = " + stack.peek());
        System.out.println(stack);
        System.out.println("--------------");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
