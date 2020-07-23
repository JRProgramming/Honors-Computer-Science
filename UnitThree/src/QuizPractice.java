import java.util.Scanner;
public class QuizPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, and the c term");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double ans = (-b + (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
		double negAns = (-b - (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
		System.out.println(ans + " and " + negAns);
	}

}
