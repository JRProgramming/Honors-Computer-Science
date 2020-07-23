import java.util.Scanner;
public class gasPrice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the miels per gallaon for your vehicle.");
		double milesPerGallon = input.nextDouble();
		System.out.println("Enter the price of gas in $/gallon.");
		double priceOfGas = input.nextDouble();
		System.out.println("Enter your budget for gas in $.");
		double budget = input.nextDouble();
		double distance = (budget/priceOfGas)*milesPerGallon;
		System.out.println("You can travel " + distance + " miles.");
	}
}
