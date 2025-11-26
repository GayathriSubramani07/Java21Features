package com.demo;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollectionExample {

    public static void main(String[] args) {

        // Before Java 21
        List<String> names = new ArrayList<>(List.of("Hello", "Gayathri", "JavaDeveloper"));

        System.out.println("First Element: " + names.get(0));               // get first element
        System.out.println("Last Element: " + names.get(names.size() - 1)); // get last element
        System.out.println("List (Before Java 21): " + names);

        // In Java 21 — SequencedCollection
        names.addFirst("GayathriJavaDeveloper");   // addFirst() -> adds element at beginning
        names.addLast("SpringBootDeveloper");      // addLast() -> adds element at end

        System.out.println("First Element (Java 21): " + names.getFirst()); // getFirst() -> retrieves first element
        System.out.println("Last Element (Java 21): " + names.getLast());   // getLast() -> retrieves last element
        System.out.println("Updated List (After addFirst/addLast): " + names);

        names.removeFirst(); // removes the first element
        names.removeLast();  // removes the last element

        System.out.println("Updated List (After removeFirst/removeLast): " + names);
    }
}






// namesHello
// JavaDeveloper
// List[Hello, Gayathri, JavaDeveloper]
// GayathrijavaDeveloper
// SpringBootDeveloper
// Updated list= [GayathrijavaDeveloper, Hello, Gayathri, JavaDeveloper, SpringBootDeveloper]
// Updated Lists Values : [Hello, Gayathri, JavaDeveloper]
