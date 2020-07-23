import java.util.Scanner;
public class printMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("# of rows");
		int rows = input.nextInt();
		System.out.println("# of columns");
		int columns = input.nextInt();
		int[][] array = new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				array[i][j] = (int)(Math.random()*10+90);
			}
		}
		printArray(array);
		System.out.println("Would you like to swap integers? 1 – yes, 2 – no");
		int num = input.nextInt();
		while(num == 1) {
			swapArray(array);
			printArray(array);
			System.out.println("Would you like to swap integers? 1 – yes, 2 – no");
			num = input.nextInt();
		}
	}
	public static void swapArray(int[][] array) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter row # and column #.");
		int row1 = input.nextInt(), column1 = input.nextInt();
		System.out.println("Enter row # and column #.");
		int row2 = input.nextInt(), column2 = input.nextInt();
		int tempStorage = array[row1][column1];
		array[row1][column1] = array[row2][column2];
		array[row2][column2] = tempStorage;
	}
	public static void printArray(int[][] x) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}
}
