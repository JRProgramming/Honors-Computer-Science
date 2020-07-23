import java.util.Scanner;
public class DifferentLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		String sentence = input.nextLine().toLowerCase();
		char[] array = new char[sentence.length()];
		boolean duplicateLetter = false;
		for(int i=0;i<sentence.length();i++) {
			for(int j=0;j<i;j++) {
				if(array[j] == sentence.charAt(i))
					duplicateLetter = true;
			}
			if(!duplicateLetter) {
				array[i] = sentence.charAt(i);
			}
			duplicateLetter = false;
		}
		int diffLetters = 0;
		for(char e: array) {
			if(e >= 97 && e<=122) {
				diffLetters ++;
			}
		}
		System.out.println("Your sentence contains " + diffLetters + " different letters.");
	}

}
