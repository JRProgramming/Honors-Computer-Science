import java.util.Scanner;
public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the slope and intercept of the first line.");
		double slope1 = input.nextDouble(), yInt1 = input.nextDouble();
		System.out.println("Enter the slope and intercept of the second line.");
		double slope2 = input.nextDouble(), yInt2 = input.nextDouble();
		double slope = slope2-slope1, yInt = yInt1-yInt2;
		double x = yInt/slope;
		double y = slope1*x + yInt1;
		System.out.println("The solution to the system y = " + slope1 + "x+" + yInt1 + " and y = " + slope2 + "x+" + yInt2 + " is (" + x + "," + y + ").");
	}

}
