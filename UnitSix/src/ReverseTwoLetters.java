import java.util.Scanner;
public class ReverseTwoLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two letters.");
		String letters = input.next();
		char firstLetter = letters.charAt(1);
		char secondLetter = letters.charAt(0);
		System.out.println(firstLetter + "" + secondLetter);
	}

}
