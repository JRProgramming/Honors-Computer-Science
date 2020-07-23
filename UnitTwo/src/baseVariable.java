import java.util.Scanner;
public class baseVariable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What base will you use?");
		int base = input.nextInt();
		System.out.println("Enter a 3-digit number in base-" + base + " (use #’s 0-" + (base-1) + ").");
		int decimal = input.nextInt();
		int firstDigit = decimal/100, secondDigit = decimal/10%10, thirdDigit = decimal%10;
		int ans = (int) (firstDigit*Math.pow(base, 2) + secondDigit*Math.pow(base, 1) + thirdDigit*Math.pow(base, 0));
		System.out.println("The equivalent number in base 10 is " + ans);
	}
}