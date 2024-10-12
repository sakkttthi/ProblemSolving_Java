package day3;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter required tables to print: ");
		int num = in.nextInt();
		System.out.println("Tables of " + " " + num + " " + "is printed below: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
