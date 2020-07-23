import java.util.Scanner;
public class OddNumberAdditionProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstNum = (int)(Math.random()*89)+10;
		firstNum += firstNum%2;
		int secondNum = (int)(Math.random()*90)+10;
		secondNum += (1-secondNum%2);
		System.out.println(firstNum + " + " + secondNum);
		int guess = input.nextInt();
		System.out.println("The correct answer is " + (firstNum + secondNum) + ".");
	}
}
