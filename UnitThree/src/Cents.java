import java.util.Scanner;
public class Cents {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of cents that you have.");
		int cents = input.nextInt();
		int quarters = cents/25;
		cents -= quarters*25;
		int dimes = cents/10;
		cents -= dimes*10;
		int nickels = cents/5;
		cents -= nickels*5;
		int pennies = cents;
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
	}

}