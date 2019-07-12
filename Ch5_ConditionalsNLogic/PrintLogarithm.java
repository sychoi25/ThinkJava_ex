package ch5;

import java.util.Scanner;

public class PrintLogarithm {

	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
		System.out.print("Input a Number> ");
		if (!scn.hasNextDouble()) {
			String str = scn.next();
			System.err.println(str+" is not a number");
			return;
		}
		double d = scn.nextDouble();
		printLogarithm(d);
		}
		}
	
	public static void printLogarithm(double x) {
		if (x<=0.0) {
			System.err.println("Error: x must be positive");
			return;
		}
		double result = Math.log(x);
		System.out.println("The log of x is "+result);
	}
}

//Input IR Scanner??
