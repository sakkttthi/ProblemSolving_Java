package day1;

public class SwapUsing3Variable {
	public static void main(String[] args) {
		int x,y,temp;
		x= 5; y= 10;
		
		System.out.println("NUmbers before swap are: " + x + " "+y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("NUmbers after swap are: " + x + " "+y);
		
		
		
	}

}
