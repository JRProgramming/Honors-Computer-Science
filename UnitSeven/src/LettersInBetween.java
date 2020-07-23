import java.util.Scanner;
public class LettersInBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two letters, separated by a space");
		char first = input.next().toLowerCase().charAt(0), second = input.next().toLowerCase().charAt(0);
		String letters = "";
		while(first != second) {
			first ++;
			if(first != second)
				letters += (char)first;
		}
		System.out.println(letters);
	}

}
