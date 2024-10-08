package day1;

import java.util.Scanner;

public class FarenheitToCelcius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in Farenheit : ");
		float farenheit = input.nextFloat();
		
		float Celcius = toCelcius(farenheit);
		System.out.println("Degree in Celcius is : " + Celcius);
	}

	public static float toCelcius(float degree) {
		return (degree-32)*5/9;
		
		
	}
}
