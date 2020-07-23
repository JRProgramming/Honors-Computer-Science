import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		String backwordWord = "";
		for(int i = word.length()-1; i>-1;i--) {
			backwordWord += word.charAt(i);
		}
		if(word.equalsIgnoreCase(backwordWord))
			System.out.println(word + " is a palindrome.");
		else 
			System.out.println(word + " is not a palindrome.");
	}

}
