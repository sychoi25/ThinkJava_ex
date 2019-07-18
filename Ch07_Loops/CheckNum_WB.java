package ch7;

import java.util.Scanner;

public class CheckNum_WB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("Input your number: ");
			if(scn.hasNextDouble()) {
				break;
			}else {
				String w = scn.next();
				System.err.println(w+" is not a number!");
			}
			System.out.println();
		}
		
	}

}
