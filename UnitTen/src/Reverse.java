import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word.");
		String word = input.next();
		String[] array = new String[word.length()];
		for(int i=0;i<word.length();i++) {
			array[i] = word.substring(i, i+1);
		}
		String letter = array[0];
		for(int i=0;i<word.length();i++) {
			if(i == word.length()-1) {
				array[i] = letter;
			} else {
				array[i] = array[i+1];
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
}
