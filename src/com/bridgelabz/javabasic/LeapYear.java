package com.bridgelabz.javabasic;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		int year;
		System.out.println("Enter any Year ");	
		Scanner scanner = new Scanner(System.in);
		
		year = scanner.nextInt();	//save the data in variable 
		
		if (year >= 1582) { // this condition is use for check leap year after 1582

			if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) { // if condition to check leap year

				System.out.println("This is Leap Year"); // print leap year
			} else {
				System.out.println("This is not a Leap Year");
			}

		} else {
			System.out.println("False"); // if user enter year before 1582 then it show false
		}
	}

}
