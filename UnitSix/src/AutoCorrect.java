import java.util.Scanner;
public class AutoCorrect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		String autoCorrectWord = word.substring(0,1).toLowerCase() + word.substring(1).toUpperCase();
		if(word.equals(autoCorrectWord))
			System.out.println(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
		else {
			System.out.println(word);
		}
	}

}
