import java.util.Scanner;
public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer.");
		int number = input.nextInt();
		boolean prime = true;
		for(int i = 2; i < Math.abs(number); i++) {
			if(number%i == 0)
				prime = false;
		}
		if(prime)
			System.out.println(number + " is a prime number.");
		else
			System.out.println(number + " is not a prime number.");
	}

}
