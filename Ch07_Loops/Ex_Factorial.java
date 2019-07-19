package ch7;

public class Ex_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(3));
	}
	
	public static int factorial(int n) {
		int result=1;
		for(int i = 1; i<=n; i++) {
			result *= i; 
		}
		return result;

}
}
