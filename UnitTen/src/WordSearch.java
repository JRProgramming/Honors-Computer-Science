import java.util.Scanner;
public class WordSearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type a word up to 10 letters");
		String word = input.next().toLowerCase();
		int row = (int)(Math.random()*10);
		int column = (int)(Math.random()*(11-word.length()));
		int letter = 0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(i == row && j >= column  && j <= (column + word.length()-1)) {
					System.out.print(word.charAt(letter) + " ");
					letter ++;
				} else {
					char randomLetter = (char)(int)(Math.random()*26+97);
					System.out.print(randomLetter + " ");
				}
			}
			System.out.println();
		}
	}
}
