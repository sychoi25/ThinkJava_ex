package ch6;

public class Ex_AckermannF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ack(3,3));
		System.out.println(ack(0,-1));
	}

	public static int ack(int m, int n) {
		if(m==0) {
			return n+1;
		}if(m>0 && n==0) {
			return ack(m-1,1);
		}if(m>0 && n>0) {
			return ack((m-1),ack(m,n-1));
		}else {
			return 0000;
		}
	}
}
