import java.util.Scanner;
public class ContainWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word that is 8 letters long.");
		String word = input.next();
		int firstRandomIndex = (int)(Math.random()*4);
		char firstLetter = word.charAt(firstRandomIndex);
		int secondRandomIndex = (int)(Math.random()*4)+3;
		char secondLetter = word.charAt(secondRandomIndex);
		String newWord = word.substring(0, firstRandomIndex) + secondLetter + word.substring(firstRandomIndex + 1, secondRandomIndex) + firstLetter + word.substring(secondRandomIndex+1);
		System.out.println(newWord);
	}

}
