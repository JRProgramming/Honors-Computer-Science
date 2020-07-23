import java.util.Scanner;
public class CarryingAdditionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstNum = (int)(Math.random()*90)+10;
		int secondNum = (int)(Math.random()*90)+10;
		int firstDig1 = firstNum/10;
		int firstDig2 = secondNum/10;
		int secondDig1 = firstNum%10;
		int secondDig2 = secondNum%10;
		int carry1 = (secondDig1+secondDig2)/10;
		int carry2 = (firstDig1+firstDig2+carry1)/10;
		int numOfCarries = carry1+carry2;
		if(numOfCarries == 1)
			System.out.println(firstNum + " + " + secondNum + " (This problem requires 1 carry.)");
		else 
			System.out.println(firstNum + " + " + secondNum + " (This problem requires " + numOfCarries + " carries.)");
		double guess = input.nextDouble();
		if(guess == firstNum+secondNum)
			System.out.println("Correct.");
		else
			System.out.println("Incorrect. The correct answer is " + (firstNum + secondNum) + ".");
	}
}
