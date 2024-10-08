package day1;

public class SwapWithout3Variable {

	public static void main(String[] args) {
		int x = 5, y = 10;

		System.out.println("Numbers before swap : " + x + " " + y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("Numbers after swap : " + x + " " + y);
	}

}
