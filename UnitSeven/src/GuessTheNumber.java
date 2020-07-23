import java.util.Scanner;
public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("A number between 0 and 100 inclusive has been generated. Try to guess it.");
		int number = (int)(Math.random()*101);
		int guess = input.nextInt();
		int attempts = 1;
		while(guess != number) {
			if(guess < number)
				System.out.println("Too low");
			else 
				System.out.println("Too high");
			attempts ++;
			guess = input.nextInt();
		}
		System.out.println("Correct, you got it with " + attempts + " tries.");
	}

}
