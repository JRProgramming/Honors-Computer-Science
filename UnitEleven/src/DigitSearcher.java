import java.util.Scanner;
public class DigitSearcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] array = new int[20];
		for(int i=0;i<array.length;i++) {
			array[i] = (int)(Math.random()*20);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("What digit would you like to search for?");
		int digit = input.nextInt();
		int count = 0;
		for(int e: array) {
			if(e == digit)
				count ++;
		}
		System.out.println("There are " + count + " " + digit + "'s");
	}

}
