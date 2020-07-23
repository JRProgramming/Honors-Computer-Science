import java.util.*;
public class NotAllowedToUseDivisionSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 positive integers to be divided");
		int first = input.nextInt(), second = input.nextInt();
		System.out.println(first + " divided by " + second + " is " + divide(first, second) + ".");
	}
	public static int divide (int dividend, int divisor) {
		int quotient = 0;
		while(quotient*divisor<=dividend)
			quotient ++;
		return quotient-1;
	}
}
