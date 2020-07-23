import java.util.Scanner;
public class firstCapitalizedRestLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next().toUpperCase();
		char first = word.charAt(0);
		word = word.toLowerCase();
		word = first + word.substring(1);
		System.out.println(word);
	}

}
