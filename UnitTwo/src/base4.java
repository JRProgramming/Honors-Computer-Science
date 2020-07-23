import java.util.Scanner;
public class base4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 5-digit binary number (using only digits from 0-3).");
		int fiveDigit = input.nextInt();
		int firstDigit = fiveDigit/10000;
		int secondDigit = fiveDigit/1000%10;
		int thirdDigit = fiveDigit/100%10;
		int fourthDigit = fiveDigit/10%10;
		int fifthDigit = fiveDigit%10;
		double ans =  firstDigit*Math.pow(4, 4)+ secondDigit*Math.pow(4, 3) + thirdDigit*Math.pow(4,  2) + fourthDigit*Math.pow(4,  1) + fifthDigit*Math.pow(4,  0);;
		System.out.println(fiveDigit + " in binary is equal to " + ans + " in decimal numbers.");
	}

}
