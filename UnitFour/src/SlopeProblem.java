import java.util.Scanner;
public class SlopeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the slope and y-intercept of the line.");
		double slope = input.nextDouble(), yIntercept = input.nextDouble();
		System.out.println("Enter the x and y values of a point, separated by a point.");
		double x = input.nextDouble(), y = input.nextDouble();
		if(x*slope + yIntercept == y) {
			System.out.println("(" + x + "," + y + ") is on the line.");
		} else {
			System.out.println("(" + x + "," + y + ") is not on the line. (" + x + "," + (x*slope + yIntercept) + ") is on the line.");
		}
	}

}
