import java.util.Scanner;
public class LastCapitalized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		String upperCase = word.toUpperCase();
		char lastLetter = upperCase.charAt(upperCase.length()-1);
		System.out.println("The last letter of " + word + " is " + lastLetter + ".");
	}

}
