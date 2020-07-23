import java.util.Scanner;
public class Exponents {
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("How many digits would you like in your array?");
		int numInt = input.nextInt();
		int [] x = randomArray(numInt);
		printArray(x);
		reverseArray(x);
		printArray(x);
		justMax(x);
		printArray(x);
	}
	public static int[] randomArray(int num) {
		int[] array = new int[num];
		for(int i=0;i<array.length;i++) {
			array[i] = (int)(Math.random()*10);
		}
		return array;
	}
	public static void reverseArray(int[] array) {
		int[] reversedArray = new int[array.length];
		for(int i=array.length;i>0;i--) {
			reversedArray[array.length-i] = array[i-1];
		}
		for(int i=0;i<array.length;i++) {
			array[i] = reversedArray[i];
		}
	}
	public static void justMax(int[] array) {
		int max = array[0];
		for(int e: array) {
			max = Math.max(max, e);
		}
		for(int i=0;i<array.length;i++) {
			array[i] = max;
		}
	}
	public static void printArray(int[] array) {
		for(int e: array) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
