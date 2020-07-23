import java.util.Scanner;
public class lkajwdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 2-digit number.");
		double num = input.nextDouble();
		boolean validEntry = num == (int)num && num >= 10 && num < 100;
		if(!validEntry) {
			System.out.println("Invalid Entry!");
		} else {
			int number = (int)num;
			int randomNum = (int)(Math.random()*90) + 10;
			boolean tenThousand = (number == randomNum);
			boolean threeThousand = (Math.abs(number-randomNum) <= 5);
			boolean thousand = (Math.abs(number-randomNum) <= 10);
			if(tenThousand) {
				System.out.println("You win $10,000.");
			} else if(threeThousand) {
				System.out.println("The correct number is " + randomNum + ".");
				System.out.println("You win $3,0000.");
			} else if(thousand) {
				System.out.println("The correct number is " + randomNum + ".");
				System.out.println("You win 1,000.");
			} else {
				System.out.println("The correct number is " + randomNum + ".");
				System.out.println("You lose.");
			}
		}
	}
}
