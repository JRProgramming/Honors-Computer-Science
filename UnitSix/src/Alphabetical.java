import java.util.Scanner;
public class Alphabetical {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a name.");
		String name1 = input.next();
		System.out.println("Please enter another name.");
		String name2 = input.next();
		char firstLetterFirstName = name1.charAt(0);
		char firstLetterSecondName = name2.charAt(0);
		int i = 0;
		while(firstLetterFirstName == firstLetterSecondName && i<(Math.min(name1.length(), name2.length()))-1) {
				i += 1;
				firstLetterFirstName = name1.charAt(i);
				firstLetterSecondName = name2.charAt(i);
		}
		System.out.println("In alphabetical order");
		if(insideWord(name1, name2) != "") {
			System.out.println(insideWord(name1, name2));
		} else if(firstLetterFirstName > firstLetterSecondName)
			System.out.println(name2 + "\n" + name1);
		else 
			System.out.println(name1 + "\n" + name2);
		if(name1.length()>name2.length())
			System.out.println(name1 + " has a longer name.");
		else if(name2.length()>name1.length())
			System.out.println(name2 + " has a longer name.");
		else
			System.out.println(name1 + " and " + name2 + " are the same length.");
	}
	public static String insideWord(String firstWord, String secondWord) {
		boolean insideWord = true;
		String shorterWord = null;
		String longerWord = null;
		for(int i=0;i<Math.min(firstWord.length(), secondWord.length());i++) {
			if(firstWord.charAt(i) != secondWord.charAt(i))
				insideWord = false;
		}
		if(insideWord) {
			int shorterLength = Math.min(firstWord.length(), secondWord.length());
			if(shorterLength == firstWord.length()) {
				shorterWord = firstWord;
				longerWord = secondWord;
			} else {
				shorterWord = secondWord;
				longerWord = firstWord;
			}
		} else {
			return "";
		}
		return shorterWord + "\n" + longerWord;
	}
}
