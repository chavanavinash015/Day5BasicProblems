package com.BridgeLabz.Day5;

import java.util.Scanner;

public class PowerOfTwo {

	static void powerOfTwo(int value) {
		
		int Result = 1;
		for (int index = 1; index <= value; index++) {
			Result = index * index;

		}
		System.out.println("Power Of + " + Result);
	}
	public static void main(String[] args) {
		powerOfTwo(5);
	}
}
