import java.util.Scanner;
public class Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers separated by a space:");
		int firstInput = input.nextInt(), secondInput = input.nextInt();
		int division = firstInput/secondInput;
		int remainder = firstInput % secondInput;
		System.out.println(secondInput + " goes into " + firstInput + " " + division + " times with a remainder of " + remainder + ".");
	}

}
