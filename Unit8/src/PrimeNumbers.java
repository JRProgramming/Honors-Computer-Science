import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive integer.");
		int integer = input.nextInt();
		System.out.print("The prime numbers less than or equal to " + integer + " are: ");
		for(int i=2;i<integer+1;i++) {
			boolean isPrime = true;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.print(i + ",");
			}
		}
	}
}
