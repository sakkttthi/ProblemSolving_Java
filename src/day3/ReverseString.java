package day3;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter text to reverse: ");
		String text = in.next();
		StringBuffer sb=new StringBuffer(text);
		StringBuffer reversedtext = sb.reverse();
		System.out.println(reversedtext);
	}

}
