import java.util.Scanner;
public class ScrambleWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-letter word.");
		String word = input.next();
		if(word.length() != 3)
			System.out.println("Invalid entry.");
		else {
			char firstChar = word.charAt(0);
			char secondChar = word.charAt(1);
			char thirdChar = word.charAt(2);
			int random = (int) (Math.random()*3);
			String randomWord = "";
			switch(random) {
			case 0: 
				randomWord += firstChar;
				word = secondChar + "" + thirdChar;
				break;
			case 1: 
				randomWord += secondChar;
				word = firstChar + "" + thirdChar;
				break;
			case 2: 
				randomWord += thirdChar;
				word = firstChar + "" + secondChar;
			}
			secondChar = word.charAt(0);
			thirdChar = word.charAt(1);
			random = (int)(Math.random()*2);
			switch(random) {
			case 0:
				randomWord += secondChar + "" + thirdChar;
				break;
			case 1:
				randomWord += thirdChar + "" + secondChar;
				break;
			}
			System.out.println(randomWord);
		}
	}

}
