
public class DigitSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 320;
		int firstTwoDigit = x%100;
		int firstDigit = firstTwoDigit % 10;
		int secondDigit = firstTwoDigit/10;
		int thirdDigit = x/100;
		int reversedInteger = firstDigit*100 + secondDigit*10 + thirdDigit;
		System.out.println("The value of x is " + x);
		System.out.println("Reversing the digits gives " + reversedInteger);
				
	}

}
