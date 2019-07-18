package ch7;

import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		boolean flag;
		do {
			System.out.print("Enter a number: ");
			if(scn.hasNextDouble()) {
				//Lboolean type
				flag = true;
				int num = scn.nextInt();
				System.out.println("Your number is "+num);
			}else {
				flag = false;
				String word = scn.next();
				System.err.println(word+" is not a number!");
				System.out.println();
			}
		}while (!flag);
		
		double x = scn.nextDouble();
	}

}
