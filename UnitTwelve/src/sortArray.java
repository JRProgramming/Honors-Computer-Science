import java.util.*;
public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many integers would you like to enter?");
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the integers");
		for(int i=0;i<size;i++) {
			array[i] = input.nextInt();
		}
		printArray(array);
		sortArray(array);
		printArray(array);
		printArray(cumulativeSum(array));
	}
	public static void printArray(int[] array) {
		for (int e: array)
			System.out.print(e + " ");
		System.out.println();
	}
	public static void sortArray(int[] array) {
		for(int i=array.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(Math.max(array[j], array[j+1]) == array[j]) {
					int max = array[j];
					int min = array[j+1];
					array[j] = min;
					array[j+1] = max;
				}
			}
		}
	}

	public static int[] cumulativeSum(int[] array) {
		int[] newArray = new int[array.length];
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
			newArray[i] = sum;
		}
		return newArray;
	}
}
