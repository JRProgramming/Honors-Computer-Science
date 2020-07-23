import java.util.Scanner;
public class Scrambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		int x = 0;
		while(x < 100) {
			int randomNum1 = (int)(Math.random()*word.length());
			char a = word.charAt(randomNum1);
			int randomNum2 = (int)(Math.random()*word.length());
			while(randomNum1 == randomNum2) { 
				randomNum2 = (int)(Math.random()*word.length());
			}
			char b = word.charAt(randomNum2);
			int min = Math.min(randomNum1, randomNum2);
			int max = Math.max(randomNum1, randomNum2);
			if(max == randomNum2) {
				word = word.substring(0, min) + "" +  b +  word.substring(min + 1, max) + a + word.substring(max + 1);
			} else {
				word = word.substring(0, min) + a +  word.substring(min + 1, max) + b + word.substring(max + 1);
			}
			x++;
		}
		System.out.println(word);
		
		/*
		 * Scanner input = new Scanner (System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		String newWord = word;
		for(int i=0;i<100;i++) {
			word = newWord;
			int random1 = (int)(Math.random()*word.length());
			char a = word.charAt(random1);
			word = word.substring(0, random1) + word.substring(random1+1);
			int random2 = (int)(Math.random()*word.length());
			char b = word.charAt(random2);
			word = word.substring(0, random2) + word.substring(random2+1);
			if(random2 >= random1) {
				random2 ++;
				newWord = newWord.substring(0, random1) + b + newWord.substring(random1 + 1, random2) + a + newWord.substring(random2+1);
			} else {
				newWord = newWord.substring(0, random2) + a + newWord.substring(random2 + 1, random1) + b + newWord.substring(random1 + 1);
			}
		}
		System.out.println(newWord);
		 */
	}

}
