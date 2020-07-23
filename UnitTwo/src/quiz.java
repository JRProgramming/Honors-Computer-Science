import java.util.Scanner;
public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 2-digit number.");
		int base10 = input.nextInt();
		int originalNumber = base10;
		int firstDigit = (int) (base10/Math.pow(8, 2));
		base10 -= firstDigit*Math.pow(8,  2);
		int secondDigit = (int) (base10/Math.pow(8, 1));
		base10 -= secondDigit*Math.pow(8,  1);
		int thirdDigit = (int) (base10/Math.pow(8, 0));
		int result = firstDigit*100 + secondDigit*10 + thirdDigit;
		System.out.println(originalNumber + " is equivalent to " + result + " in base-8.");

	}

}
