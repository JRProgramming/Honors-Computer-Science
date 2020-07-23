import java.util.Scanner;
public class baseToBase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What base would you like to enter a number in?");
		int originalBase = input.nextInt();
		System.out.println("Enter the 2-digit base-" + originalBase + " number (0-" + (originalBase-1) + " only).");
		int baseNumber = input.nextInt();
		System.out.println("What base would you like to convert into?");
		int newBase = input.nextInt();
		
		int firstDigit = baseNumber/10;
		int secondDigit = baseNumber%10;
		int baseToDecimal = firstDigit*originalBase + secondDigit;
		
		int firstNewDigit = (int) (baseToDecimal/Math.pow(newBase, 6));
		baseToDecimal -= Math.pow(newBase, 6)*firstNewDigit;
		int secondNewDigit = (int) (baseToDecimal/Math.pow(newBase, 5));
		baseToDecimal -= Math.pow(newBase, 5)*secondNewDigit;
		int thirdNewDigit = (int) (baseToDecimal/Math.pow(newBase, 4));
		baseToDecimal -= Math.pow(newBase, 4)*thirdNewDigit;
		int fourthNewDigit = (int) (baseToDecimal/Math.pow(newBase, 3));
		baseToDecimal -= Math.pow(newBase, 3)*fourthNewDigit;
		int fifthNewDigit = (int) (baseToDecimal/Math.pow(newBase, 2));
		baseToDecimal -= Math.pow(newBase, 2)*fifthNewDigit;
		int sixthNewDigit = baseToDecimal/newBase;
		int seventhNewDigit = baseToDecimal -= newBase*sixthNewDigit;
		int ans = firstNewDigit*1000000 + secondNewDigit*100000 + thirdNewDigit*10000 + fourthNewDigit*1000 + fifthNewDigit*100 + sixthNewDigit*10 + seventhNewDigit;
		System.out.println(baseNumber + " in base " + originalBase + " equals " + ans + " in base " + newBase);
	}
}
