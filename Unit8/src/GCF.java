import java.util.Scanner;
public class GCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two positive integers.");
		int first = input.nextInt(), second = input.nextInt();
		int i;
		for(i = Math.min(first, second); i>=0; i--) {
			if(first%i == 0 && second%i == 0)
				break;
		}
		System.out.println("The greatest common factor is " + i + ".");
	}

}
