import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		String sentence = input.nextLine().toLowerCase();
		char[] array = new char[sentence.length()];
		for(int i=0;i<sentence.length();i++) {
			array[i] = sentence.charAt(i);
		}
		int vowels = 0;
		for(char e: array) {
			if(e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u') {
				vowels ++;
			}
		}
		System.out.println("Your sentence has " + vowels + " vowels.");
	}

}
