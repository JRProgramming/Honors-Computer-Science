import java.util.Scanner;
public class ThirdAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 angles of a triangle.");
		System.out.println("The third angle is " + thirdAngle(input.nextDouble(), input.nextDouble()));
	}
	public static double thirdAngle(double ang1, double ang2) {
		return 180-ang1-ang2;
	}

}