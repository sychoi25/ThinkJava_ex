package ch4;

public class Ex_Date {

	public static void printAmerican(String day, int date , String month, int year) {
		System.out.println(day+", "+month+" "+date+", "+year);
	}
	
	public static void printEuropean(String day, int date , String month, int year) {
		System.out.println(day+", "+date+" "+month+", "+year);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Fri";
		int date = 12;
		String month = "July";
		int year = 2019;
		
		printAmerican(day, date, month, year);
		printEuropean(day, date, month, year);

	}

}
