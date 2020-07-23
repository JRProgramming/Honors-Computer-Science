import java.util.Scanner;
public class base9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 2-digit number.");
		int digit = input.nextInt();
		int originalDigit = digit;
		int firstDigit = digit/81;
		digit -= 81*firstDigit;
		int secondDigit = digit/9;
		digit -= 9*secondDigit;
		int thirdDigit = digit;
		int base9 = firstDigit*100 + secondDigit*10 + thirdDigit;
		System.out.println(originalDigit + " is equal to " + base9 + " in base 9.");
	}
}
