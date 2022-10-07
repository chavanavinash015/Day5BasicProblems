package com.BridgeLabz.Day5;

import java.util.Scanner;

public class FlipCoin {

	static void flipCoin() {
		int Heads=0;
		int Tails=0;
		int Count=1;
		double randomValue=0.0;
		
		int flips = 0;
		while(Count < flips);

		randomValue=Math.random();
		System.out.println(Count+" "+randomValue);

		if (randomValue<0.5) {
			Heads++;
			System.out.println(" Heads ");
		}
		else { 
			Tails++;
			System.out.println(" Tails ");
		}
		Count++;

		System.out.println();
		System.out.println("Number of Heads :" +Heads);
		System.out.println("Number of Tails :" +Tails);

		double Headpercent = (double)Heads/flips+100;
		double Tailpercent = (double)Tails/flips+100;

		System.out.println("Percentage of Heads :" +Headpercent);
		System.out.println("Percentage of tails :" +Tailpercent);
	}

		public static void main(String[] args) {
			flipCoin();
	}
}


