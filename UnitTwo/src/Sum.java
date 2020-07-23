import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit number");
		int threeDigit = input.nextInt();
		int firstDigit = threeDigit/100, secondDigit = threeDigit/10%10, thirdDigit = threeDigit%10;
		int sum = firstDigit + secondDigit + thirdDigit;
		System.out.println("The sum of the three digits is " + sum);
	}
}
