import java.util.Scanner;
public class RandomOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five random integers");
		int[] array = new int[5];
		int[] scram = new int[5];
		for(int i=0;i<5;i++) {
			array[i] = input.nextInt();
		}
		for(int i=0;i<5;i++) {
			int index = (int)(Math.random()*5);
			if(scram[index] == 0) {
				scram[index] = array[i];
			} else {
				i--;
			}
		}
		for(int e: scram) {
			System.out.print(e + " ");
		}
	}

}
