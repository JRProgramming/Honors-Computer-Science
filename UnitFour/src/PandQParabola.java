import java.util.Scanner;
public class PandQParabola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int first = (int)(Math.random()*25)-12;
		int second = (int)(Math.random()*25)-12;
		System.out.println("Enter values for p and q.   x^2 + " + (first+second) + "x + " + (first*second) + " = (x + p)(x + q)");
		int guess1 = input.nextInt(), guess2 = input.nextInt();
		if(first == guess1 && second == guess2 || first == guess2 && second == guess1)
			System.out.println("Correct.");
		else {
			System.out.println("Incorrect, please try again.");
			guess1 = input.nextInt();
			guess2 = input.nextInt();
			if(first == guess1 && second == guess2 || first == guess2 && second == guess1)
				System.out.println("Correct.");
			else
				System.out.println("Sorry, the correct answers are " + first + " and " + second + ".");
		}
			
	}

}
