import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a factorial of a number.");
		int num = input.nextInt();
		System.out.println(factorial(num));
	}
	
	public static int factorial (int num) { 
		int facNum = 1;
		for(int i=1;i<=num;i++) {
			facNum *= i;
		}
		return facNum;
	}

}
