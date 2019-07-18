package ch6;

public class Ex_Prod {
	public static void main(String[] args) {
		System.out.println(prod(1, 4));
		
		System.out.println(prodRe(1,4));
		System.out.println(prodRe(2,5));
		System.out.println(prodRe(2,5));
		}
	
	public static int prod(int m, int n) {
		if (m == n) {
		return n;
		} else {
		int recurse = prod(m, n - 1);
		int result = n * recurse;
		return result;
		}
	}
	
	public static int prodRe(int a, int b) {
		if(a==b) {
			return b;
		}else {
			return b*prodRe(a,b-1);
		}
	}

}
