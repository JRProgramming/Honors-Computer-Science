import java.util.Scanner;
public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers to be divided");
		System.out.println(divide(input.nextDouble(), input.nextDouble()));
	}

	public static double divide(double d1, double d2) {
		return d1/d2;
	}
}
