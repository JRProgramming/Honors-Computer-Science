import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 characters.");
		String word = input.next();
		char firstLetter = word.charAt(0);
		char secondLetter = word.charAt(1);
		char thirdLetter = word.charAt(2);
		int digits = 0;
		int letters = 0;
		if(firstLetter >= 48 && firstLetter <= 57)
			digits ++;
		if(secondLetter >= 48 && secondLetter <= 57)
			digits ++;
		if(thirdLetter >= 48 && thirdLetter <= 57)
			digits ++;
		if(firstLetter >= 65 && firstLetter <= 90 || firstLetter >= 97 && firstLetter <= 122)
			letters ++;
		if(secondLetter >= 65 && secondLetter <= 90 || secondLetter >= 97 && secondLetter <= 122)
			letters ++;
		if(thirdLetter >= 65 && thirdLetter <= 90 || thirdLetter >= 97 && thirdLetter <= 122)
			letters ++;
		System.out.println("You entered " + digits + " numbers and " + letters + " letters.");
	}

}
