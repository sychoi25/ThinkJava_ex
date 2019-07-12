package ch3;

import java.util.Scanner;

public class ex_TimeConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int input;
		int h, m, s;
		final int HRATE = 60;
		
		System.out.print("Input seconds> ");
		input = scn.nextInt();
		
		//input = 60(60h+m)+s
		s = input%HRATE;
		m = ((input-s)/HRATE)%HRATE;
		h = (int)(input/(HRATE*HRATE));
		
		System.out.printf("Output> %d seconds = %d hours, %d minutes, %d seconds",input,h,m,s);
	}

}
