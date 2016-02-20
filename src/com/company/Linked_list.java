package com.company;

import java.util.LinkedList;

/**
 * Created by uitschool JV on 2/20/2016.
 */
public class Linked_list {
    public static void main(String[] args) {
        LinkedList<String> LL = new LinkedList<String>();

        LL.add("F");
        LL.add("B");
        LL.add("D");
        LL.add("E");
        LL.add("C");
        LL.addLast("Z");
        LL.addFirst("A");

        LL.add(1, "A2");

        System.out.println("Original contents of LL: " + LL);

        LL.remove("F");
        LL.remove(2);

        System.out.println("Contents of LL after deletion: " + LL);

        LL.removeFirst();
        LL.removeLast();

        System.out.println("Contents of LL after deleting first and last: " + LL);

        String val = LL.get(2);
        LL.set(2,val + "Changed");

        System.out.println("LL after chande: " + LL);

    }
}
