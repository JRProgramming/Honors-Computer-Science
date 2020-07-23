import java.util.Scanner;
public class OneAppearance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many integers would you like to enter?");
		int length = input.nextInt();
		int[] array = new int[length];
		System.out.println("Please enter the integers, separated by spaces.");
		for(int i=0;i<length;i++) {
			array[i] = input.nextInt();
		}
		int ones = 0;
		for(int e:array) {
			int digits = 0;
			while(e/Math.pow(10, digits) >= 10) {
				digits ++;
			}
			digits ++;
			for(int i=digits-1;i>-1;i--) {
				if((int)(e/Math.pow(10, i)%10) == 1) {
					ones ++;
				}
			}
		}
		System.out.println("Your number contains " + ones + " \"1\"s.");
	}

}
