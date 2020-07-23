import java.util.Scanner;
public class Median {

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
		int next = array[0];
		int previousNext = 0;
		for(int i=length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(Math.min(array[j], array[j+1]) == array[j+1]) {
					int lowerNum = array[j+1];
					int higherNum = array[j];
					array[j] = lowerNum;
					array[j+1] = higherNum;
				}
			}
		}
		double median = 0;
		if(length%2 == 1) {
			median = array[length/2];
		} else {
			median = (array[length/2-1] + array[length/2])/2.0;
		}
		System.out.println(median);
	}

}
