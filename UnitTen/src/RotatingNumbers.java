import java.util.Scanner;
public class RotatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the array.");
		int num = input.nextInt();
		int[] array = new int[num];
		for(int i=0;i<num;i++) {
			array[i] = (int)(Math.random()*10);
			System.out.print(array[i]);
		}
		System.out.println();
		for(int i=0;i<num-1;i++) {
			for(int j=0;j<num;j++) {
				if(j != num-1) {
					array[j] = array[j+1];
				} else {
					array[j] = array[0];
				}
				System.out.print(array[j]);
			}
			System.out.println();
		}
	}

}
