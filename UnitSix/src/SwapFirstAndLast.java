import java.util.Scanner;
public class SwapFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two words.");
		String first = input.next(), second = input.next();
		char firstLetterFirstWord = first.charAt(0);
		char firstLetterSecondWord = second.charAt(0);
		char lastLetterFirstWord = first.charAt(first.length()-1);
		char lastLetterSecondWord = second.charAt(second.length()-1);
		System.out.println(lastLetterSecondWord + first.substring(1, first.length()-1) + firstLetterSecondWord + " " + lastLetterFirstWord + second.substring(1, second.length()-1) + firstLetterFirstWord);
	}
}
