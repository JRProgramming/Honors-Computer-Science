import java.util.Scanner;
public class AbsValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		printV(input.nextLine());
	}
	public static void printV(String sentence) {
		String[] sent = new String[sentence.length()];
		for(int i=0;i<sentence.length();i++) {
			sent[i] = sentence.substring(i, i+1);
		}
		for(String e: sent) {
			System.out.println(e);
		}
	}

}
