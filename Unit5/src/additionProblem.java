import java.util.Scanner;	
public class additionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstNum = (int)(Math.random()*9)+1;
		int secondNum = (int)(Math.random()*9)+1;
		System.out.println("Evaluate " + firstNum + " + " + secondNum);
		int guess = input.nextInt();
		boolean isCorrect = firstNum + secondNum == guess;
		System.out.println(firstNum + " + " + secondNum + " = " + guess + " is " + isCorrect + ".");
	}

}
