package Lesson.L10_Collection.List1;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s="madam";
        List<Character>list=new LinkedList<>();
        for (char ch:s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> iterator= list.listIterator();
        ListIterator<Character> reverseIterator= list.listIterator(list.size());

        boolean isPalindrome=true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            if(iterator.next()!=reverseIterator.previous()){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }
        else System.out.println("NOT palindrome");
    }
}
