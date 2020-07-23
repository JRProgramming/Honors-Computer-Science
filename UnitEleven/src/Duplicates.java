import java.util.Scanner;
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five integers");
		int[] array = new int[5];
		for(int i=0;i<5;i++) {
			array[i] = input.nextInt();
		}
		int[] countArray = new int[5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i != j && array[i] == array[j]) {
					countArray[i] ++;
				}
			}
		}
		boolean skip = false;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(array[i] == array[j] && i != j && j > i) {
					skip = true;;
				}
			}
			if(!skip) {
				countArray[i] ++;
				if(countArray[i] != 1) {
					System.out.println("There are " + countArray[i] + " " + array[i] + "'s");
				}
			}
			skip = false;
		}
	}
}
