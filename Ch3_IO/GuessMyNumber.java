package ch3;

import java.util.*;
//import static java.lang.Math.abs; (no need)



public class GuessMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int guess;
		Random rnd = new Random();
		int ans = rnd.nextInt(100)+1;
		//whie(true){
		System.out.println("Guess what?!");
		System.out.print("I think ");
		guess = scn.nextInt();
		System.out.println("So, your answer is "+guess);
		
		
		if(guess == ans) {
			System.out.println("Correct!! Well done:)");
		}else {
			System.out.println("Try again:(");
			System.out.println("Your answer is off by "+Math.abs(guess-ans));
		}
	}
}
