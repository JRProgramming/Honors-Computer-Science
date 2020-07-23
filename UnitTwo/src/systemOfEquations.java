import java.util.Scanner;
public class systemOfEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the slope and intercept of the first line.");
		Scanner input = new Scanner(System.in);
		int m1 = input.nextInt(), b1 = input.nextInt();
		System.out.println("Enter the slope and intercept of the second line.");
		int m2 = input.nextInt(), b2 = input.nextInt();
		int rM = m2 - m1;
		int rB = b1 - b2;
		int x = rB/rM;
		int y = m1*x + b1;
		System.out.println("The solution to the system y = " + m1 + "x+" + b1 + " and y = " + m2 + "x+" + b2 + " is (" + x + "," + y + ")");
	}

}
