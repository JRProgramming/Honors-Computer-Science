import java.util.Scanner;
public class typeOfBill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a dollar amount that is less than $10.");
		double money = input.nextDouble();
		int fives = (int) (money/5);
		money -= 5*fives;
		System.out.println(fives);
		int ones = (int) (money/1);
		money -= 1*ones;
		int quarters = (int) (money/0.25);
		money -= 0.25*quarters;
		int dimes = (int) (money/0.1);
		money -= 0.1*dimes;
		int nickels = (int) (money/0.05);
		money -= 0.05*nickels;
		int pennies = (int) (money/0.01);
		money -= 0.01*pennies;
		System.out.println(fives + " fives\n" + ones + " ones\n" + quarters + " quarters\n" + dimes + " dimes\n" + nickels + " nickels\n" + pennies + " pennies\n");
	}

}
