package org.learning.collections;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        LinkedList<String> linklist = new LinkedList<>();

        linklist.add("Lucy");
        linklist.add("John");
        linklist.add("Sarah");
        linklist.add("Jones");
        linklist.add("Ash");

        System.out.println(linklist);

        linklist.addFirst("A");

        System.out.println(linklist);

        linklist.addLast("Z");

        System.out.println(linklist);

        linklist.add("C");

        System.out.println(linklist);

        System.out.println(linklist.getFirst());

        System.out.println(linklist.getLast());

        linklist.set(2,"B");

        System.out.println(linklist);
    }
}
