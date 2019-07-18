package ch5;

import java.util.Scanner;

public class Ex_99Bottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("# of bottles> ");
		int i = scn.nextInt();
		
		lyrics(i);
		System.out.println("No bottles of beer on the wall,");
		System.out.println("no bottles of beer,");
		System.out.println("Go to the store and buy some more,");
		System.out.println(i+" bottles of beer on the wall.");
	}
	
	public static void lyrics(int n) {
		if(n>0) {
			System.out.println(n+" bottles of beer on the wall,");
			System.out.println(n+" bottles of beer,");
			System.out.println("ya' take one down, ya' pass it around,");
			if(n==1) {
				System.out.println("no more bottles of beer on the wall.");
			}else {
				System.out.println((n-1)+" bottles of beer on the wall.");
			}
			System.out.println();
			lyrics(n-1);
		}
	}

}
