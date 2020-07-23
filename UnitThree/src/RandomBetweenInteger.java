import java.util.Scanner;
public class RandomBetweenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two positive integers separated by a space.");
		int firstTerm = input.nextInt(), secondTerm = input.nextInt();
		int lowerTerm = Math.min(firstTerm, secondTerm);
		int higherTerm = Math.max(firstTerm, secondTerm);
		System.out.println("The random integer on the interval [" + lowerTerm + "," + higherTerm + "] is " + ((int)(Math.random()*(higherTerm-lowerTerm+1)+lowerTerm)));
	}

}
