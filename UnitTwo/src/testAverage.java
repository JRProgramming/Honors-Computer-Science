import java.util.Scanner;
public class testAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first 3 test grades separated by spaces.");
		int firstTest = input.nextInt(), secondTest = input.nextInt(), thirdTest = input.nextInt();
		System.out.println("How many more tests do you have?");
		int remainingTests = input.nextInt();
		System.out.println("What grade are you shooting for?");
		int goalGrade = input.nextInt();
		double combinedTestScores = firstTest + secondTest + thirdTest;
		double average = ((goalGrade*(3 + remainingTests)) - combinedTestScores)/remainingTests;
		System.out.println("You need to average " + average + " on the next " + remainingTests + ".");			
	}

}
