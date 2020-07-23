import java.util.Scanner;
public class RangeOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a 4-letter word.");
		String word = input.next();
		char a = word.charAt(0);
		char b = word.charAt(1);
		char c = word.charAt(2);
		char d = word.charAt(3);
		int max = Math.max(Math.max(Math.max(a, b), c), d);
		int min = Math.min(Math.min(Math.min(a, b), c), d);
		System.out.println("The lettes of " + word + " range from " + (char)min + " to " + (char)max + ".");
	}

}
