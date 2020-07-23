import java.util.Scanner;
public class CarryingAdditionProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many problems do you want?");
		int directions = input.nextInt();
		for(int i=0;i<directions;i++) {
			int firstDigit = (int)(Math.random()*10), secondDigit = (int)(Math.random()*(9) + 1);
			int num = firstDigit*10 + secondDigit;
			int oneDigit = (int)(Math.random()*(secondDigit))+(10-secondDigit);
			System.out.println(num + " + " + oneDigit);
		}
	}

}
