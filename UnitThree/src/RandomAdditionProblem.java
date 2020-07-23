import java.util.Scanner;
public class RandomAdditionProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many addition problems do you want?");
		int problems = input.nextInt();
		int correctAnswers = 0;
		for(int i = 0; i < problems; i ++) {
			int first = (int)(Math.random()*10);
			int second = (int)(Math.random()*10);
			System.out.println(first + " + " + second);
			double answer = input.nextDouble();
			if(answer == first+second) {
				System.out.println("Your answer is correct! The correct answer is " + (first+second) + ".");
				correctAnswers ++;
			} else {
				System.out.println("Your answer in incorrect. The correct answer is " + (first+second) + ".");
			}
			if(i == problems - 1) {
				System.out.println("You are done. Congrats. Your score is " + correctAnswers + "/" + problems + ", or " + ((double)correctAnswers/problems)*100 + "%");
			}
		}
	}
}
