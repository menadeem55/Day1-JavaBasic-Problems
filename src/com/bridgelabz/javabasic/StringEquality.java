package com.bridgelabz.javabasic;

public class StringEquality {

	public static void main(String[] args) {

		String s1 = "Nadeem";
		String s2 = "Nadeem";
		String s3 = "Sameer";

		// checking for equality
		boolean val1 = s2.equals(s1);
		boolean val2 = s2.equals(s3);

		// prints the return values
		System.out.println("String 1 is equal to String 2: " + val1);
		System.out.println("String 2 is equal to string 3: " + val2);

	}

}
