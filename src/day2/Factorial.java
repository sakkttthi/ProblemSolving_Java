package day2;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number to find factorial: ");
		int num = in.nextInt();
		int fact = 1;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial for given number is: " + " " + fact);

		}else {
			System.out.println("Enter positive integer. Try agin!");
		}

	}

}
