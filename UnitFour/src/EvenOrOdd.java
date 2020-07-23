import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer.");
		double integer = input.nextDouble();
		if(integer%1 != 0.0) {
			System.out.println("Invalid Entry");
		} else {
			int remainder = (int)(integer%2);
			if(remainder == 0) {
				System.out.println((int)(integer) + " is even.");
			} else {
				System.out.println((int)(integer) + " is odd.");
			}
		}
	}

}
