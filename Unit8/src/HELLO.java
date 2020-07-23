import java.util.Scanner;
public class HELLO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String line = "";
		System.out.println("What word would you like?");
		String word = input.next();
		System.out.println("How many lines would you like to print?");
		int lines = input.nextInt();
		int x = 0;
		for(int i=0;i<lines;i++) {
			for(int j=-1;j<i;j++) {
				System.out.print(word.charAt(x%word.length()));
				x++;
			}
			System.out.println();
		}
	}

}
