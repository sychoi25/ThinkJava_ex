package ch6;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Input> ");
		int n = scn.nextInt();
		System.out.print(n+"th number: ");
		System.out.print(fbnc(n));
	}
	
	public static int fbnc(int i) {
		if(i==1 || i==2) {
			return 1;
		}else {
			return fbnc(i-1)+fbnc(i-2);
		}
	}
}
