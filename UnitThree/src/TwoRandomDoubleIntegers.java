import java.util.Scanner;
public class TwoRandomDoubleIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many digits should the first integer be?");
		int firstDigits = input.nextInt();
		System.out.println("How many digits should the second integer be?");
		int secondDigits = input.nextInt();
		System.out.println("How many?");
		int repeat = input.nextInt();
		for(int i=0;i<repeat;i++) {
			int firstTerm = (int)((Math.random()*(Math.pow(10, firstDigits)-Math.pow(10, firstDigits-1)))+Math.pow(10, firstDigits-1));
			int secondTerm = (int)((Math.random()*(Math.pow(10, secondDigits)-Math.pow(10, secondDigits-1)))+Math.pow(10, secondDigits-1));
			System.out.println("Please add: " + firstTerm + " + " + secondTerm + ".");
		}
		
	}
}
//answer key is wrong