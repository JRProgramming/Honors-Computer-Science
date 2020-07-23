import java.util.Scanner;
public class TwoBySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] array = new int[4][2];
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Please enter position[" + i + "][" + j + "]");
				int num = input.nextInt();
				array[i][j] = num;
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
	}

}
