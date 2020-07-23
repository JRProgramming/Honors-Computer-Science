import java.util.Scanner;
public class WordSpacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String word = input.next();
		int length = word.length();
		int spacing = (100/(length-1))-1;
		String extended = "";
		for(int i=0;i<length;i++) {
			System.out.print(word.charAt(i));
			extended += word.charAt(i);
			if(i == length-1)
				break;
			for(int j=0;j<spacing;j++) {
				System.out.print(" ");
				extended += " ";
			}
		}
	}

}
