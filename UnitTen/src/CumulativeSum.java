import java.util.Scanner;
public class CumulativeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		int[] array = new int[input.nextInt()];
		System.out.println("Please enter the numberse spearated by speaces.");
		for(int i=0;i<6;i++) {
			if(i != 0) {
				array[i] = (int)(array[i-1] + input.nextInt());
				System.out.print(array[i] + " ");
			} else {
				array[i] = input.nextInt();
			}
		}

	}

}
