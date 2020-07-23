import java.util.Scanner;
public class UniqueIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please five integers");
		int[] list1 = new int[5];
		for(int i=0;i<5;i++) 
			list1[i] = input.nextInt();
		System.out.println("Please five integers");
		int[] list2 = new int[5];
		for(int i=0;i<5;i++)
			list2[i] = input.nextInt();
		int[] unique1 = new int[5];
		int[] unique2 = new int[5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(list1[i] == list2[j]) {
					unique1[i] = 1;
				}
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(list1[i] == list2[j]) {
					unique1[i] = 1;
				}
			}
		}
		int diff = 0;
		for(int e: unique1) {
			if(e == 1)
				diff ++;
		}
		for(int e: unique2) {
			if(e == 1)
				diff ++;
		}
		int[] array = new int[diff];
		int index = 0;
		for(int i=0;i<5;i++) {
			if(unique1[i] == 1) {
				array[index] += list1[i];
				index ++;
			}
		} 
		for(int i=0;i<5;i++) {
			if(unique2[i] == 1) {
				array[index] += list1[i];
				index ++;
			}
		} 
		if(diff != 0) {
			for(int e: array) {
				System.out.print(e + ", ");
				System.out.println("appear in only 1 array");
			}
		} else {
			System.out.print("No integers appear in only 1 array");
		}
	}
}
