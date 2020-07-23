import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word, number, or phrase.");
		String oldWord = input.nextLine();
		oldWord = oldWord.toLowerCase();
		String word = "";
		for(int i = 0;i<oldWord.length();i++) {
			if(((int)oldWord.charAt(i) >= 97 && (int)oldWord.charAt(i) <= 122) || ((int)oldWord.charAt(i) >= 48 && (int)oldWord.charAt(i) <= 57)) {
				word += oldWord.charAt(i);
			}
		}
		char[] array = new char[word.length()];
		for(int i = 0;i<word.length();i++) {
			array[i] = word.charAt(i);
		}
		char[] backwardArray = new char[word.length()];
		for(int i = word.length()-1;i>-1;i--) {
			backwardArray[word.length()-1-i] = word.charAt(i);
		}
		boolean match = true;
		for(int i=0;i<array.length;i++) {
			if(array[i] != backwardArray[i]) {
				match = false;
				break;
			}
		}
		if(match) {
			System.out.println(oldWord + " is a palindrome.");
		} else {
			System.out.println("\"" +  oldWord + "\"" + " is not a palindrome.");
		}
	}	

}
