import java.util.Scanner;
public class NoCarrryingAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstTenth = (int)(Math.random()*10);
		int firstOnes = (int)(Math.random()*10);
		int secondTenth = (int)(Math.random()*(10-firstTenth));
		int secondOnes = (int)(Math.random()*(10-firstOnes));
		int first = firstTenth*10 + firstOnes;
		int second = secondTenth*10 + secondOnes;
		System.out.println(first + " + " + second);
		double guess = input.nextDouble();
		System.out.println("The correct answer is " + (first + second) + ".");
	}

}
