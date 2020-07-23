import java.util.Scanner;
public class Base4ToBase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int randomNumber = (int)(Math.random()*21);
		int originalNumber = randomNumber;
		System.out.println("Enter the base-4 equivalent to the base-10 number of " + randomNumber + ".");
		int guess = input.nextInt();
		int firstDigit = (int)(randomNumber/Math.pow(4, 2));
		randomNumber -= firstDigit*Math.pow(4,  2);
		int secondDigit = (int)(randomNumber/Math.pow(4, 1));
		randomNumber -= secondDigit*Math.pow(4, 1);
		int thirdDigit = randomNumber;
		int base4 = firstDigit*100 + secondDigit*10 + thirdDigit;
		System.out.println(originalNumber + " in base-10 is equal to " + base4 + " in base-4.");
	}

}
