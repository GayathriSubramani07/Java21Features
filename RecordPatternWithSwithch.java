package com.demo;

public class RecordPatternWithSwithch {

	static void printDetails(Object obj) {
	    switch (obj) {
	        case Employee(String name, int age) when age > 18 ->
	            System.out.println(name + " is an adult (" + age + ")");
	        case Employee(String name, int age) ->
	            System.out.println(name + " is a minor (" + age + ")");
	        default ->
	            System.out.println("Not a person");
	    }
	}


    public static void main(String[] args) {
        Employee p = new Employee("Gayathri ", 2);
        printDetails(p);
    }
}

record Employee(String name, int age) {}
