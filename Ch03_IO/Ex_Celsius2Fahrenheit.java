package ch3;

import java.util.Scanner;

public class ex_C2F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//f = c * 9/5 +32
		
		Scanner scn = new Scanner(System.in);
		
		double f;
		double c;
		double m = 9/5;
		int cons = 32;

		
		System.out.print("input> ");
		c = scn.nextDouble();
		f = c*m+cons;
		System.out.printf("Result> %.1fC = %.1fF\n",c,f);
		
	}

}
