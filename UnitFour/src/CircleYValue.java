import java.util.Scanner;
public class CircleYValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an x-value for the circle centered at the origin, radius = 10.");
		double x = input.nextDouble();
		if(x <= 10 && x >= -10) {
			System.out.println("enter 1 for a positive y-value, -1 for a negative y-value.");
			int value = input.nextInt();
			if(value == 1 || value == -1) {
				double distance = Math.pow(100-(x*x), .5)*value;
				System.out.println("The y-value is " + distance + ".");
			} else {
				System.out.println("Invalid entry.");
			}
		} else {
			System.out.println("Invalid entry.");
		}
	}

}
