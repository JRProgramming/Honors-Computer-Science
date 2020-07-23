import java.util.Scanner;
public class NumberOfDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five integers");
		int[] array = new int[5];
		for(int i=0;i<5;i++) {
			array[i] = input.nextInt();
		}
		int[]arrayCount = new int[5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				if(array[i] == array[j]) {
					arrayCount[i] ++;
				}
			}
		}
		int duplicate = 0;
		int length = 0;
		for(int i=0;i<5;i++) {
			if(Math.max(duplicate, arrayCount[i]) == arrayCount[i]) {
				duplicate = array[i];
			}
		}
		for(int i=0;i<5;i++) {
			if(Math.max(length, arrayCount[i]) == arrayCount[i])
				length = arrayCount[i];
		}
		if(length > 0) {
			length ++;
			System.out.println("There are " + length + " " + duplicate + "'s on this list.");
		} else {
			System.out.println("There are no duplicates on this list");
		}
	}
}
