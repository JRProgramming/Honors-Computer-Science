import java.util.Scanner;
public class RoundToGivenDecimalPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a double.");
		double num = input.nextDouble();
		System.out.println("How many decimal places?");
		double decimalPlaces = input.nextDouble();
		int round = (int)(((num*Math.pow(10, decimalPlaces))%1)/.5);
		num *= Math.pow(10, decimalPlaces);
		num += round;
		int ans = (int)num;
		num = ans/Math.pow(10, decimalPlaces);
		System.out.println(num);
	}

}
