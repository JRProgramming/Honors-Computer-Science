import java.util.Scanner;
public class NumOfOddIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many integers would you like to enter?");
		int length = input.nextInt();
		System.out.println("Please enter the integers, separated by spaces.");
		int[] array = new int[length];
		for(int i=0;i<length;i++) {
			array[i] = input.nextInt();
		}
		int numOfOddIntegers = 0;
		for(int e: array) {
			if(e%2 == 1) {
				numOfOddIntegers ++;
			}
		}
		System.out.println(numOfOddIntegers + " of the integers are odd.");
	}

}
