import java.util.Scanner;
public class Digits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println(digits(input.nextInt()));
	}

	public static int digits(int num) {
		int digits = 0;
		while(num/Math.pow(10, digits) >= 1)
			digits ++;
		return digits;
	}
}
