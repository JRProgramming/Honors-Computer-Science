import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer.");
		double doubleInteger = input.nextDouble();
		boolean valid = (doubleInteger == (int)doubleInteger);
		if(!valid) {
			System.out.println(doubleInteger + " is an invalid entry.");
		} else {
			int integer = (int)doubleInteger;
			boolean even = (integer%2 == 0);
			if(even) {
				System.out.println(integer + " is an even integer.");
			} else {
				System.out.println(integer + " is an odd integer.");
			}
		}
		
		
		
	}

}
