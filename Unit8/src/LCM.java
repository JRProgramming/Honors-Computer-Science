import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two positive integers.");
		int first = input.nextInt(), second = input.nextInt();
		int min = Math.min(first, second);
		int max = Math.max(first, second);
		int i = 0;
		for(i = max; i<min*max; i++) {
			if(i%min == 0 && i%max == 0)
				break;
		}
		System.out.println("The least common multiple is " + i + ".");
	}

}
