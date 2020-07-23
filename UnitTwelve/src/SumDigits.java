import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		System.out.println("answer is " + sumdigs(num));
	}

	
	public static int sumdigs(int num) {
		int digits = 0;
		int sum = 0;
		while(num/Math.pow(10, digits) >= 1)
			digits ++;
		int[] array = new int[digits];
		for(int i=0;i<digits;i++) {
			array[i] += (num/Math.pow(10, i))%10;
		}
		for(int e: array) {
			sum += e;
		}
		return sum;
	}
}
