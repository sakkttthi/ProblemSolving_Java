package day1;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter number to add");
	int num1 = in.nextInt();
	int num2 = in.nextInt();
	int sum = num1+num2;
	
	System.out.println("Addition of two numbers are : " + sum );
	
	}

}
