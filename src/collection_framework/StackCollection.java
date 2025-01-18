package collection_framework;

import java.util.Collection;
import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack();
        numbers.push(12);
        numbers.push(15);
        numbers.push(17);
        numbers.push(19);

        System.out.println(numbers);

        numbers.pop();

        System.out.println(numbers);   // LIFO

        System.out.println(numbers.peek());

//        System.out.println(numbers);
        numbers.add(2,66);

        System.out.println(numbers);

    }
}
