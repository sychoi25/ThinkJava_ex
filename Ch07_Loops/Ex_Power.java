package ch7;

public class Ex_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(3,4));
	}

	public static double power(double x, int n) {
		double result = 1;
		for(int i = 0; i < n; i++) {
			result *= x;
		}
		return result;
	}
}
