package com.demo;

public class RecordPatternWithInstanceof {

    public static void beforejava21(Object obj) {
        if (obj instanceof Employee) {
            Employee p = (Employee) obj;  // Manual casting (old way)
            System.out.println(p.name() + p.age());
        }
    }

    public static void injava21(Object obj) {
        if (obj instanceof Employee(String name, int age)) {  // Record Pattern (Java 21)
            System.out.println(name + age);
        }
    }

    public static void main(String[] args) {
        Employee p = new Employee("Gayathri ", 22);
        beforejava21(p);
        injava21(p);
    }
}

record Employee(String name, int age) {}


// Gayathri 22
// Gayathri 22
