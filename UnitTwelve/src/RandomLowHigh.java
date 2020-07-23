import java.util.*;
public class RandomLowHigh {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many integers would you like to enter?");
		int num = input.nextInt();
		System.out.println("Please enter the integers.");
		int[] array = new int[num];
		for(int i=0;i<array.length;i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Which position would you like printed?");
		int position = input.nextInt();
		System.out.println(which(position, array) + " is in position " + position);
	}
	public static int which (int num, int...x) {
		return x[num];
	}
}
