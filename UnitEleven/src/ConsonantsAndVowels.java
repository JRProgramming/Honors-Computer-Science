import java.util.Scanner;
public class ConsonantsAndVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		String lowWord = word.toLowerCase();
		int vowelCounter = 0;
		int consCounter = 0;
		for(int i=0;i<lowWord.length();i++) {
			if(lowWord.charAt(i) == 97 || lowWord.charAt(i) == 101 || lowWord.charAt(i) == 105 || lowWord.charAt(i) == 111 || lowWord.charAt(i) == 117) {
				vowelCounter ++;
			} else {
				consCounter ++;
			}
		}
		char[] cons = new char[consCounter];
		char[] vowels = new char[vowelCounter];
		int consIndex = 0;
		int vowelsIndex = 0;
		for(int i=0;i<lowWord.length();i++) {
			if(lowWord.charAt(i) == 97 || lowWord.charAt(i) == 101 || lowWord.charAt(i) == 105 || lowWord.charAt(i) == 111 || lowWord.charAt(i) == 117) {
				vowels[vowelsIndex] += word.charAt(i);
				vowelsIndex ++;
			} else {
				cons[consIndex] += word.charAt(i);
				consIndex ++;
			}
		}
		for(int e: cons) {
			System.out.print((char)e);
		}
		System.out.print(" ");
		for(int e: vowels) {
			System.out.print((char)e);
		}
	}

}
