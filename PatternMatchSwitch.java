package com.demo;

public class PatternMatchSwitch {

    // Before Java 21
    static void beforeJava21(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj; // Manual cast
            System.out.println("String value (length): " + s.length());
        } else if (obj instanceof Integer) {
            Integer i = (Integer) obj; // Manual cast
            System.out.println("Integer value (double): " + (i * 2));
        } else {
            System.out.println("Unknown type");
        }
    }
 static void java21(Object obj) {
        switch (obj) {
            case String s -> System.out.println("String value (length): " + s.length());
            case Integer i -> System.out.println("Integer value (double): " + (i * 2));
            case null -> System.out.println("Null value provided");
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        System.out.println("----- Before Java 21 -----");
        beforeJava21("Gayathri");
        beforeJava21(10);

        System.out.println("----- In Java 21 -----");
        java21("Gayathri");
        java21(10);
        java21(null);
    }
} 





// ----- Before Java 21 -----
// String value (length): 8
// Integer value (double): 20
// ----- In Java 21 -----
// String value (length): 8
// Integer value (double): 20
// Null value provided
