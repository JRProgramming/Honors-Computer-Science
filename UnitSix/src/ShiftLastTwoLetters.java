import java.util.Scanner;
public class ShiftLastTwoLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		String lastTwoLetters = word.substring(word.length()-2);
		System.out.println(lastTwoLetters + word.substring(0, word.length()-2));
	}

}
