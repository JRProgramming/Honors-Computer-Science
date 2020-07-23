import java.util.Scanner;
public class Slope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2 separated by spaces");
		double x1 = input.nextDouble(), y1 = input.nextDouble(), x2 = input.nextDouble(), y2 = input.nextDouble();
		double slope = (y2 - y1)/(x2-x1);
		double y_intercept = y1 - slope*x1;
		System.out.println("y = " + slope + "x + " + y_intercept);
	}

}
