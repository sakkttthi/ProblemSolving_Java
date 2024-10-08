package day1;

import java.util.Scanner;

public class NesterIfElse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter marks obtained: ");
		int mark = in.nextInt();
		
		int passmark = 50;
		
		if (mark >= passmark) {
			if (mark > 90) {
				System.out.println("Grade A");
			}
			else if (mark > 70) {
				System.out.println("Grade B");
			}else {
				System.err.println("Not eligible for grade");
			}
			
		}
		
	}

}
