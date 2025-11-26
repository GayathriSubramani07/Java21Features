package com.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class SequencedMapExample {

    public static void main(String[] args) {

        // Before Java 21 - Normal LinkedHashMap
        Map<Integer, String> oldMap = new LinkedHashMap<>();
        oldMap.put(1, "Gayathri");
        oldMap.put(2, "Java");
        oldMap.put(3, "Developer");

        System.out.println("Before Java 21 Map: " + oldMap);

        // In Java 21 - SequencedMap methods
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Gayathri");
        map.put(2, "Java");
        map.put(3, "SpringBoot");

        System.out.println("\n---- Java 21 (SequencedMap) ----");
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        map.putFirst(0, "Developer"); // Add entry at the beginning
        map.putLast(4, "Engineer");   // Add entry at the end

        System.out.println("Updated Map: " + map);

        map.pollFirstEntry(); // Removes first entry
        map.pollLastEntry();  // Removes last entry

        System.out.println("After Removing First & Last: " + map);

        System.out.println("Reversed View: " + map.reversed());
    }
}
