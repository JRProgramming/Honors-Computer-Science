import java.util.Scanner;
public class ParabolaProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the a, b, and c for the parabola y = ax^2 + bx + c.");
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		System.out.println("Press 1 to enter the x-value, 2 to enter the y-value.");
		double XY = input.nextDouble();
		if(XY == 1) {
			System.out.println("Enter the x-value.");
			double x = input.nextDouble();
			double ans = a*Math.pow(x, 2) + b*x + c;
			System.out.println("The y-value is " + ans + ".");
		} else if(XY == 2) {
			System.out.println("Enter the y-value.");
			double y = input.nextDouble();
			c -= y;
			if(Math.pow(b, 2)-4*a*c >= 0) {
				double ans = (-b + Math.pow(Math.pow(b,  2) - 4*a*c, .5))/(2*a);
				if(Math.pow(b, 2)-4*a*c != 0) {
					double ans2 = (-b - (Math.pow(Math.pow(b,  2) - 4*a*c, .5)))/(2*a);
					if(ans == (int)ans && ans2 == (int)ans2) {
						System.out.println("The x-value is " + (int)ans + " and " + (int)ans2 + ".");
					} else {
						System.out.println("The x-value is " + ans + " and " + ans2 + ".");
					}
				} else {
					if(ans == (int)ans) {
						System.out.println("The x-value is " + (int)ans + ".");
					} else {
						System.out.println("The x-value is " + ans + ".");
					}
				}
				
			} else {
				System.out.println(y + " is not a y-value for this function.");
			}
		} else {
			System.out.println("Invalid input.");
		}
	}

}
