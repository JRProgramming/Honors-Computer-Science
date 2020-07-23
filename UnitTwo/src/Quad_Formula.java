import java.util.Scanner;
public class Quad_Formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a, b, and c, separated by spaces, the coefficients of a quadratic equation.");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		double sqRt = Math.pow(Math.pow(b, 2) - 4*a*c, 0.5);
		b = -b;
		double addB = b + sqRt;
		double subtractB = b - sqRt;
		double answerA = addB / 2*a;
		double answerB = subtractB / 2*a;
		System.out.println("The roots of the equation are " + answerA + " and " + answerB);
	}

}
