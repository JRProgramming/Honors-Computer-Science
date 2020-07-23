import java.util.Scanner;
public class RemovesFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		char first = word.charAt(0);
		String newWord = "";
		if((int)first != 122 && first != 90) {
			newWord = (char)((int)(first + 1)) + word.substring(1);
		} else {
			if((int)first == 90)
				newWord = "A" + word.substring(1);
			else
				newWord = "a" + word.substring(1);
		}
		System.out.println(newWord);
	}

}
