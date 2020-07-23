import java.util.Scanner;
public class RandomSubtractionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many subtraction problems do you want?");
		int problems = input.nextInt();
		for(int i = 0; i < problems; i ++) {
			int first = (int)(Math.random()*100);
			int second = (int)(Math.random()*100);
			first = Math.max(first, second);
			second = Math.min(first,  second);
			System.out.println(first + " - " + second);
			double answer = input.nextDouble();
			if(answer == first-second) {
				System.out.println("Your answer is correct! The correct answer is " + (first-second) + ".");
			} else {
				System.out.println("Your answer in incorrect. The correct answer is " + (first-second) + ".");
			}
		}
	}

}
