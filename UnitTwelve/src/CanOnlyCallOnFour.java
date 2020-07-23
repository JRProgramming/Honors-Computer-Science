
public class CanOnlyCallOnFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = randArray(20);
		printArray(x);
		x=evenOnly(x);
		printArray(x);
	}
	public static int [] randArray(int x) {
		int[] array = new int[x];
		for(int i=0;i<x;i++) {
			array[i] = (int)(Math.random()*10);
		}
		return array;
	}
	public static void printArray(int[] x) {
		for(int e: x) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	public static int[] evenOnly(int [] x) {
		int length = 0;
		for (int e: x) {
			if(e%2 == 0)
				length ++;
		}
		int[] even = new int[length];
		int lengthIndex = 0;
		for(int i=0;i<x.length;i++) {
			if(x[i]%2 == 0) {
				even[lengthIndex] = x[i];
				lengthIndex ++;
			}
		}
		return even;
	}

}
