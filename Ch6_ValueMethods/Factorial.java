package ch6;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Input> ");
		int i = scn.nextInt();
		System.out.println("Output> "+factorial(i));
	}

	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
}
