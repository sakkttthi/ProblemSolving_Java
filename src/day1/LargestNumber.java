package day1;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter two random numbers: ");
	int num1 = in.nextInt();
	int num2 = in.nextInt();
	
	int largestnum = (num2 > num1) ? num2 : num1 ;
	
	System.out.println("Largest number is : " + largestnum);
	
	}

}
