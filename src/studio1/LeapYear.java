package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = in.nextInt();
		
		boolean byFour = (year % 4) == 0;
		boolean byHundred = (year % 100) != 0;
		boolean fourHundred = (year % 400) == 0;
		
		boolean leapYear = (byFour && byHundred) || fourHundred;
		
		System.out.println(year + " is a leap year: " + leapYear);
		
		
		System.out.println( 0.5 % 0.3); //you can use modulus on doubles!
		
		// TODO Auto-generated method stub

	}

}
