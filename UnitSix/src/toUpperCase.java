import java.util.Scanner;
public class toUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		String sentence = input.nextLine();
		String capitalized = sentence.toUpperCase();
		System.out.println(capitalized);
	}

}
