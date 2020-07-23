import java.util.Scanner;
public class RandomlyPositionedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		for(int i = 0; i < word.length(); i ++) {
			int random = (int)(Math.random()*20);
			for(int j=0;j<random;j++) {
				System.out.print(" ");
			}
			System.out.println(word.charAt(i));
		}
	}

}
