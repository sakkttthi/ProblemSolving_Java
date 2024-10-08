package day1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = in.nextInt();

		if (num != 0) {
			if (num % 2 == 0) {
				System.out.println("Number is EVEN");
			} else {
				System.out.println("Number is ODD");
			}

		} else {
			System.out.println("Enter valid number");
		}

	}

}
