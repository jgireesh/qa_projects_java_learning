package org.learning.collections;

import java.util.Stack;

public class Stacks {

    //LIFO
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("C");
        stack.push("B");
        stack.push("A");

        System.out.println(stack);

        String poppedElement1 = stack.pop();
        System.out.println("Popped element 1 "+stack);

        String poppedElement2 = stack.peek();
        System.out.println("Popped element 2 "+stack);
    }
}
