import java.util.Scanner;
public class numberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sentence = input.nextLine().toLowerCase();
		int vowelCount = 0;
		for(int i = 0; i < sentence.length(); i ++) {
			switch(sentence.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount ++;
			}
		}
		System.out.println(vowelCount + " vowels.");
	}	

}
