package ch6;

public class Ex_IsTriangle {
	
	public static boolean isTriangle(int a, int b, int c) {
		return (a+b>c && b+c>a && c+a>b);
	}
}