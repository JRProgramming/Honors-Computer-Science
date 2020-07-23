import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five numbers.");
		int[] array = new int[5];
		for(int i=0;i<5;i++) {
			array[i] = input.nextInt();
		}
		int max = array[0];
		int min = array[0];
		for(int i=0;i<5;i++) {
			if(Math.max(max, array[i]) == array[i]) {
				max = array[i];
			}
			if(Math.min(min, array[i]) == array[i]) {
				min = array[i];
			}
		}
		System.out.println(max - min);
	}

}
