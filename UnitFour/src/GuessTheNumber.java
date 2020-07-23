import java.util.Scanner;
public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int magicNumber = (int)(Math.random()*90 + 10);
		System.out.println("Guess the number on [10,100)");
		double userGuess = input.nextDouble();
		if(userGuess >= 100 || userGuess < 10 || userGuess%1 != 0.0) {
			System.out.println("Invalid entry.");
		} else {
			int guess = (int)userGuess;
			int firstDigitGuess = guess/10;
			int secondDigitGuess = guess%10;
			int firstDigitMagic = magicNumber/10;
			int secondDigitMagic = magicNumber%10;
			if(magicNumber == guess) {
				System.out.println("Correct. You win $1000.");
			} else if(firstDigitGuess == firstDigitMagic  || secondDigitGuess == secondDigitMagic) {
				System.out.println("The correct number is " + magicNumber + ".\nYou win $100.");
			} else {
				System.out.println("The correct number is " + magicNumber + ".\nYou lose.");
			}
		}
	}
}
