import java.util.Arrays;
public class minimumNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {321, 1, 2, 4, 345, 234, 5, 12334, 2348};
		System.out.println(findIndex(array, 0));
	}
	public static int findIndex(int[] arr, int m) {
		int num = arr[0];;
		int index = Int();
		int firstNum = 0;
		int[] array = new int[arr.length];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < num) {
				
			} else if(arr[i] > num) {
				array[m+1] = arr[i];
			}
			System.out.println(Arrays.toString(array));
		}
		array[index] = num;
		index = arr[m];
		System.out.println(Arrays.toString(array));
		return index;
	}
	public static int minNumber(int[] x) {
		int previousNumber = 0;
		int previousIndex;
		int minNumber = x[0];
		int maxNumber = x[1];
		for(int i=0;i<x.length;i++) {
			if(x[i] > maxNumber) {
				maxNumber = x[i];
			}
			if(x[i] < minNumber) {
				minNumber = x[i];
			}
		}
		return minNumber;
	}
	public static int maxNumber(int[] x) {
		int maxNumber = x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i] > maxNumber) {
				maxNumber = x[i];
			}
		}
		return maxNumber;
	}
	public static int randomNumber(int[] x) {
		int randomNumber = (int)(Math.random()*x.length);
		return x[randomNumber];
	}
	public static boolean isDouble(int[] x) {
		boolean isDouble = Boolean();
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<i;j++) {
				if(x[i] == x[j] ) {
					isDouble = true;
				}
			}
 		}
		return isDouble;
	}
	private static int Int() {
		return 0;
	}
	private static boolean Boolean() {
		// TODO Auto-generated method stub
		return false;
	}
}
