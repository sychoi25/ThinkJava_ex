package ch6;

public class Ex_OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oddSum(5));
		System.out.println(oddSumV2(5));
		
		System.out.println(oddSum(11));
		System.out.println(oddSumV2(11));
	}
	
	public static int oddSum(int n) {
		//n = 2k - 1 , k>0 positive int
		//2*(k(k+1)/2)-k = k^2
		return (int) Math.pow(((n+1)/2),2);
	}

	public static int oddSumV2(int i) {
		if(i==1) {
			return 1;
		}else {
			return i+oddSumV2(i-2);
		}
	}
}
