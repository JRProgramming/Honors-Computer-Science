import java.util.Scanner;
public class ContainsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = (int)'a', e = (int)'e', i=(int)'i', o='o', u='u';
		System.out.println("Please enter a letter.");
		String charInput = input.next();
		boolean isUpperCase = false;
		if(charInput.toLowerCase() != charInput) {
			isUpperCase = true;
			charInput = charInput.toLowerCase();
		}
		char letter = charInput.charAt(0);
		if(letter >= 97 && letter <= 122) {
			int num = (int)letter;
			if(isUpperCase)
				letter = (char)(letter-32);
			if(num <= e) {
				if(num == a)
					System.out.println(letter + " is a vowel.");
				else if(num == e)
					System.out.println(letter + " is a vowel.");
				else if(isUpperCase)
					System.out.println("The vowel that follows " + letter + " alphabetically is  E.");
				else 
					System.out.println("The vowel that follows " + letter + " alphabetically is e.");
			} else if(num <= i) {
				if(num == i)
					System.out.println(letter + " is a vowel.");
				if(isUpperCase)
					System.out.println("The vowel that follows " + letter + " alphabetically is I.");
				else 
					System.out.println("The vowel that follows " + letter + " alphabetically is i.");
			} else if(num <= o) {
				if(num == o)
					System.out.println(letter + " is a vowel.");
				if(isUpperCase) 
					System.out.println("The vowel that follows " + letter + " alphabetically is O.");
				else 
					System.out.println("The vowel that follows " + letter + " alphabetically is o.");
			}
			else if (num <= u) {
				if(num == u)
					System.out.println(letter + " is a vowel.");
				if(isUpperCase)
					System.out.println("The vowel that follows " + letter + " alphabetically is U.");
				else 
					System.out.println("The vowel that follows " + letter + " alphabetically is u.");
			} else {
					System.out.println("There are no vowels after " + letter + ".");
			}
		} else {
			System.out.println("Invalid entry");
		}
	}

}
