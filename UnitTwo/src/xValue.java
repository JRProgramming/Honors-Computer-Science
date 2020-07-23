import java.util.Scanner;
public class xValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the line's slope.");
		double slope = input.nextDouble();
		System.out.println("Enter the line's y-intercept.");
		double yIntercept = input.nextDouble();
		System.out.println("Enter an x-value");
		double xValue = input.nextDouble();
		double yValue = slope*xValue + yIntercept;
		System.out.println("The corrresponding y-value is " + yValue);
	}

}
