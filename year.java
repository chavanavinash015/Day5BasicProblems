package com.BridgeLabz.Day5;

public class year {

	static void checkLeapYear(int year) {
		
		if (year % 4 == 0 && year % 100 != 0 ||  year%100==0 && year % 400 == 0 ) {
			System.out.println("This is Leap Year");
		} else {
			System.out.println("This is Not Leap year");
		}
	}
	public static void main(String[] args) {
		checkLeapYear(2020);
	}
	
}
