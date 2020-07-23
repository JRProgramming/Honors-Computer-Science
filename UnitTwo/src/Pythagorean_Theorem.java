import java.util.Scanner;
public class Pythagorean_Theorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lengths of the 2 legs of the right triangle, separated by a space.");
		double firstLeg = input.nextDouble(), secondLeg = input.nextDouble();
		double hypotenuse = Math.pow(Math.pow(firstLeg,  2) + Math.pow(secondLeg, 2), 0.5);
		System.out.println("The length of the hypotenuse is " + hypotenuse);
	}
}
