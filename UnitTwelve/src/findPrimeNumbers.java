import java.util.Scanner;
public class findPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer.");
		int a = input.nextInt();
		findPrimes(a);
	}
	public static void findPrimes(int x) {
		int numberOfPrimeNumbers = 0;
		for(int i=2;i<x;i++) {
			if(isPrime(i))
				numberOfPrimeNumbers ++;
		}
		int[] primeNumbers = new int[numberOfPrimeNumbers];
		int index = 0;
		for(int i=2;i<x;i++) {
			if(isPrime(i)) {
				primeNumbers[index] = i;
				index ++;
			}
		}
		for(int e: primeNumbers) {
			System.out.print(e + " ");
		}
 	}
	public static boolean isPrime(int x) {
		boolean prime = true;
		for(int i=2;i<x;i++) {
			if(x%i==0)
				prime = false;
		}
		return prime;
	}
}
