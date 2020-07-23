import java.util.Scanner;
public class SwapTwoLettters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		int randomPosition = (int)(Math.random()*word.length());
		char firstLetter = word.charAt(randomPosition);
		String newWord = word.substring(0, randomPosition) + word.substring(randomPosition + 1);
		int secondRandomPosition = (int)(Math.random()*newWord.length());
		char secondLetter = newWord.charAt(secondRandomPosition);
		String newestWord = newWord.substring(0, secondLetter) + newWord.substring(secondLetter + 1);
		int min = Math.min(randomPosition, secondRandomPosition);
		int max = Math.max(randomPosition, secondRandomPosition);
		if(min == randomPosition) {
			max ++;
			word = word.substring(0, min) + secondLetter + word.substring(min + 1, max) + firstLetter + word.substring(max + 1);
		} else {
			word = word.substring(0, min) + firstLetter + word.substring(min + 1, max) + secondLetter + word.substring(max + 1);
		}
		System.out.println(word);
	}
}
