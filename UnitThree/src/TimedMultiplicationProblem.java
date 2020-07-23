import java.util.Scanner;
public class TimedMultiplicationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstTerm = (int)(Math.random()*(90))+10, secondTerm = (int)(Math.random()*(90))+10;
		System.out.println(firstTerm + "*" + secondTerm);
		double startTime = System.currentTimeMillis();
		double guess = input.nextDouble();
		double endTime = System.currentTimeMillis();
		double timeElapsed = endTime - startTime;
		System.out.println("The correct answer is " + (firstTerm*secondTerm));
		System.out.println("Total time: " + (timeElapsed/1000) + " seconds.");
	}

}
