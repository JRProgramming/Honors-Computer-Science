import java.util.Scanner;
public class CountTheLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String sentence = input.nextLine().toLowerCase();
		System.out.println("Please enter a letter.");
		String stringLetter = input.next();
		char outputLetter = stringLetter.charAt(0);
		char letter = stringLetter.toLowerCase().charAt(0);
		int num = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i) == letter) {
				num ++;
			}
		}
		System.out.println("There are " + num  + " " + outputLetter + "'s in the sentence.");
	}

}
