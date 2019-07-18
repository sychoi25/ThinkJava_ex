package ch6;

public class Ex_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(3,0));
		System.out.println(power(3,2));
		System.out.println(power(3,4));
		System.out.println(power(3,3));

	}
	
	public static double power(double x, int n) {
		if(n==0) {
			return 1;
		}if(n%2==0) {
			if(n==2) {
				return Math.pow(x, n);
			}else {
				return Math.pow(x, 2)*Math.pow((Math.pow(x, ((n-2)/2))),2);	
			}
		}else {
			return x*(Math.pow(x, n-1));
		}
	}

}
