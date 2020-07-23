import java.util.Scanner;
public class decimalValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a character.");
		char character = input.next().charAt(0);
		System.out.println("The decimal value assigned to " + character + " is " + (int)character + ".");
	}

}
