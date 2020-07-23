import java.util.Scanner;
public class UserChosenPointLIne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the slope of the line.");
		double slope = input.nextDouble();
		System.out.println("Enter the y-intercept of the line");
		double y_intercept = input.nextDouble();
		System.out.println("Enter the x and y-coordinates of a point, separated by a space.");
		double x_cord = input.nextDouble(), y_cord = input.nextDouble();
		System.out.println("The distance between the line and the point is .");
	}

}
