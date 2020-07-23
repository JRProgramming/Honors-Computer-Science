import java.util.Scanner;
public class DigitAdditionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many digit addition problem would you like?");
		int digit = input.nextInt();
		if(digit == Math.abs(digit)) {
			int firstNum = (int)(Math.random()*(Math.pow(10, digit)-Math.pow(10, digit-1))+Math.pow(10,  digit-1));
			int secondNum = (int)(Math.random()*(Math.pow(10, digit)-Math.pow(10, digit-1))+Math.pow(10,  digit-1));
			System.out.println(firstNum + " + " +  secondNum);
			int guess = input.nextInt();
			if(guess == (firstNum + secondNum)) {
				System.out.println("Correct.");
			} else {
				System.out.println("Incorrect. The correct answer is " + (firstNum + secondNum));
			}
		} else {
			System.out.println("Invalid Entry.");
		}
		
	}

}
