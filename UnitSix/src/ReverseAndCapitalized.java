import java.util.Scanner;
public class ReverseAndCapitalized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two words.");
		String firstWord = input.next(), secondWord = input.next();
		secondWord = secondWord.toUpperCase();
		System.out.println(secondWord + " " +  firstWord);
		
	}

}
