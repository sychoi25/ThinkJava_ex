package ch5;

public class Ex_CheckFermat {

	public static void checkFermat(int a, int b, int c, int n) {
		int A = (int) Math.pow(a, n);
		int B = (int) Math.pow(b, n);
		int C = (int) Math.pow(c, n);
		
		if((n>2) && (A+B==C)) {
			System.out.println("Holy smokes, Fermat was wrong!");
		}else {
			System.out.println("No, that doensn't work.");
		}
	}
	
}
