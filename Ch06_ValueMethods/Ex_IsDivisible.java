package ch6;

import java.util.Scanner;

public class Ex_IsDivisible {
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Dividend> ");
		int nd = scn.nextInt();
		System.out.print("Divisor> ");
		int md = scn.nextInt();
		
		System.out.println(isDivisible(nd,md));
	}
	
	public static boolean isDivisible(int n, int m) {
		return n%m == 0;
	}

}
