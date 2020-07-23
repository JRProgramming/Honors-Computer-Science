import java.util.Scanner;
public class numOfJeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much do the jeans cost (in dollars)?");
		double cost = input.nextDouble();
		System.out.println("How much money do you have?");
		double money = input.nextDouble();
		int jeans = (int) (money/cost);
		double change = money-(cost*jeans);
		System.out.println("You could buy " + jeans + " pairs. Your change will be $" + change + ".");
	}

}
 