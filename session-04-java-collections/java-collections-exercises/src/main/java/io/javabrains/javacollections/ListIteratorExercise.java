package io.javabrains.javacollections;

/*
Print the list in forward and reverse order using iterators only
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExercise {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        Iterator listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.println("values asc = " + listIterator.next());
        }

        ListIterator listIt = list.listIterator(list.size());
        while (listIt.hasPrevious()) {
            System.out.println("values desc = " + listIt.previous());
        }

    }
}
