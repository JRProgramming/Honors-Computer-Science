import java.util.Scanner;
public class NumbersBeforeFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter four integers, make sure to include a four.");
		int[] array = new int[4];
		for(int i=0;i<4;i++) {
			array[i] = input.nextInt();
		}
		boolean fourArrived = false;
		for(int i=0;i<4;i++) {
			if(!fourArrived && array[i] != 4) {
				System.out.print(array[i] + " ");
			} else {
				fourArrived = true;
				
			}
		}
	}

}
