package com.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class SequencedSetExample {

    public static void main(String[] args) {
        //  Before Java 21 - Normal LinkedHashSet
        LinkedHashSet<String> oldSet = new LinkedHashSet<>();
        oldSet.add("Gayathri");
        oldSet.add("Java");
        oldSet.add("Developer");

        System.out.println("Before Java 21 Set: " + oldSet);

        // In Java 21 - SequencedSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Gayathri");
        set.add("Spring");
        set.add("Boot");

        System.out.println("\n---- Java 21 (SequencedSet) ----");
        System.out.println("First Element: " + set.getFirst());
        System.out.println("Last Element: " + set.getLast());

        set.addFirst("Developer");
        set.addLast("Engineer");

        System.out.println("Updated Set: " + set);

        set.removeFirst();
        set.removeLast();

        System.out.println("After Removing First & Last: " + set);

        System.out.println("Reversed Set: " + set.reversed());
    }
}
