import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the points, x1, y1, x2, y2 , separated by spaces.");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble(), y1 = input.nextDouble(), x2 = input.nextDouble(), y2 = input.nextDouble();
		double firstFactor = Math.pow(x2-x1, 2), secondFactor = Math.pow(y2-y1, 2);
		double distance = Math.pow(firstFactor + secondFactor, 0.5);
		System.out.println("The distance between the points is " + distance + " units.");
	}

}
