package ch5;

import java.util.Scanner;
import java.util.Random;

public class Ex_RecursivelyGuessMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int ans = rnd.nextInt(100)+1;
		
		guessing(ans);
	
	}	
	
	public static void guessing(int answer) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Choose your number btw 1 to 100> ");
		int i = scn.nextInt();	
		
		if(i==answer) {
			System.out.println("Correct!");
			return;
		}else {
			System.out.println("Try again!");
			System.out.println("Your answer is off by "+Math.abs(i-answer));
			System.out.println();
			guessing(answer);
		}
	}
	
}
