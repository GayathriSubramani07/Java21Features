package com.demo;

public class SwitchWithNull {
	
	public static void before21(String a) {
		
		if(a == null)
		{
			System.out.println("Null value");
			return ;
		}
		
		
		switch(a) {
		
		case "one"->System.out.println("1");
		case "Two"->System.out.println("2");
		default->System.out.println("Unknow");
			
		}
	}
	
	public static void java21(String s) {
		switch(s) {
		case "one"->System.out.println("1");
		case "Two"->System.out.println("2");
		case null->System.out.println("Null value");
		default->System.out.println("Unknow");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Before 21");
		before21("one");
		before21(null);
		before21("some");
		System.out.println("java 21");
		java21("one");
		java21(null);
		java21("somethings");
	}

}
