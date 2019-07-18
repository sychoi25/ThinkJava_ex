package ch7;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i<10) {
			row(i);
			System.out.println();
			i +=1;
		}
	}

	public static void row(int a) {
		int b = 1;
		while(b<10) {
			System.out.printf("%5d",a*b);
			b += 1;
		}
	}
	
	public static void col(int p) {
		while (p<10) {
			p += 1;
		}
	}
	
}
