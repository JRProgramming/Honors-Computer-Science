import java.util.Scanner;
public class ComplexSubtractionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstDigit = (int)(Math.random()*8+2), secondDigit = (int)(Math.random()*9);
		int firstNum = firstDigit*10 + secondDigit;
		int secondNumFirstDigit = (int)(Math.random()*(firstDigit)+1);
		int secondNumSecondDigit = (int)(Math.random()*(9-secondDigit) + secondDigit + 1);
		int secondNum = secondNumFirstDigit*10 + secondNumSecondDigit;
		System.out.println(firstNum + " - " + secondNum);
		double startTime = System.currentTimeMillis();
		int guess = input.nextInt();
		double endTime = System.currentTimeMillis();
		double elapsed = (endTime-startTime)/1000;
		System.out.println("The correct answer is " + (firstNum - secondNum));
		System.out.println("Total time is " + elapsed + ".");
	}

}
