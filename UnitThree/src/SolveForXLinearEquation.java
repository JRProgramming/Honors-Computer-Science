import java.util.Scanner;
public class SolveForXLinearEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = (int)(Math.random()*10);
		int x = (int)(Math.random()*20);
		int b = (int)(Math.random()*100);
		System.out.println("Solve the equation for x.");
		int c = a*x + b;
		System.out.println(a + "x + " + b + " = " + c);
		int guess = input.nextInt();
		System.out.println("The correct answer is x = " + x  + ".");
	}

}
