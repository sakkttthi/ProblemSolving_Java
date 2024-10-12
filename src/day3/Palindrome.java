package day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to check: ");
		String text= sc.next();
		
		String reversetext = reverseString(text);
		
		if (text.equalsIgnoreCase(reversetext)) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("This is a not palindrome");
		}
		
	}
	
	public static String reverseString(String str) {
		StringBuffer sb=new StringBuffer(str);
		String str1 =  sb.reverse().toString();
		return str1;
		
	}

}
