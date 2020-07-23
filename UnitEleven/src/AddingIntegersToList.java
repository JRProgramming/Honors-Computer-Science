import java.util.Scanner;
public class AddingIntegersToList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your integers and hit enter after each.");
		int[] array = new int[10000];
		int length = 1;
		int num = input.nextInt();
		while(num != 0) {
			boolean match = false;
			for(int i=0;i<length;i++) {
				if(array[i] == num) {
					match = true;
					break;
				}
			}
			if(match) {
				System.out.println(num + " is already in the list.");
			} else {
				array[length-1] += num;
			}
			length ++;
			num = input.nextInt();
		}
		for(int i=0;i<length-1;i++) {
			System.out.println(array[i] + " ");
		}
	}
}
