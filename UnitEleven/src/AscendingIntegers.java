import java.util.Scanner;
public class AscendingIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter as many integers as you want. Enter 0 to stop.");
		int[] array = new int[10000];
		int i = 0;
		int num = input.nextInt();
		while(num != 0) {
			array[i] = num;
			i++;
			num = input.nextInt();
		}
		for(int j=i-1;j>-1;j--) {
			for(int k=0;k<j;k++) {
				if(Math.max(array[k], array[k+1]) == array[k]) {
					int max = array[k];
					int min = array[k+1];
					array[k] = min;
					array[k+1] = max;
				}
			}
		}
		for(int j=0;j<i;j++) {
			System.out.print(array[j] + " ");
		}
	}

}
