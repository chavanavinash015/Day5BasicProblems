package com.BridgeLabz.Day5;

import java.util.Scanner;

public class HarmonicNumber {

	static void harmonicNumber(int num) {
		
		double result = 0.0;
		
		while(num > 0) {
			result = result + (double) 1 / num;
			num--;
			System.out.println(result+" ");
			
		}
		
	}
	public static void main(String[] args) {
		harmonicNumber(10);
	}
}
