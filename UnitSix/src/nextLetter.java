import java.util.Scanner;
public class nextLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//122 = 'z', 90 = 'Z', 97 = 'a' 65 = 'A'
		Scanner input = new Scanner(System.in);
		String stringLetter = input.next();
		char letter = stringLetter.charAt(0);
		char nextLetter = 'a';
		if(letter == 90) 
			nextLetter = 65;
		else if(letter != 122)
			nextLetter = (char)(letter + 1);
		System.out.println(nextLetter);
	}

}
