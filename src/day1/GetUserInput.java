package day1;

import java.util.Scanner;

public class GetUserInput {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = input.nextInt();
		
		System.out.println("Enter Name :");
		String name = input.next();
		
		System.out.println("Entered number and names are :" + num + " " + name);
	}

}
