import java.util.Scanner;
public class nearestTwoPerfectSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int num = input.nextInt();
		int sqRt = (int) Math.pow(num, 0.5);
		int firstSq = (int) Math.pow(sqRt, 2), secondSq = (int) Math.pow(sqRt + 1, 2);
		System.out.println("The perfect squares above and below " + num + " are " + firstSq + " and " + secondSq);
	}

}
