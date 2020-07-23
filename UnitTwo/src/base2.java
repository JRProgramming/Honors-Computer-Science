import java.util.Scanner;
public class base2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 5-digit binary number (all 1’s and 0’s).");
		int fiveDigit = input.nextInt();
		int firstDigit = fiveDigit/10000;
		int secondDigit = fiveDigit/1000%10;
		int thirdDigit = fiveDigit/100%10;
		int fourthDigit = fiveDigit/10%10;
		int fifthDigit = fiveDigit%10;
		double ans =  firstDigit*Math.pow(2, 4)+ secondDigit*Math.pow(2, 3) + thirdDigit*Math.pow(2,  2) + fourthDigit*Math.pow(2,  1) + fifthDigit*Math.pow(2,  0);;
		System.out.println(fiveDigit + " in binary is equal to " + ans + " in decimal numbers.");
	}

}
