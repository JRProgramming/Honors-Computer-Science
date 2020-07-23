import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[6400];
		for(int i=0;i<6400;i++)
			array[i] = i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number you would like to search for.");
		int num = input.nextInt();
		int high = array.length;
		int low = 0;
		int halfWay = (high+low)/2;
		boolean isInList = false;
		for(int e: array) {
			if(e == num)
				isInList = true;
		}
		int count = 0;
		if(isInList) {
			while(true) {
				halfWay = (high+low)/2;
				System.out.println(halfWay);
				if(num == array[halfWay]) {
					break;
				} else if(num < array[halfWay]) { 
					high = halfWay;
				} else {
					low = halfWay;
				}
				count ++;
			}
			System.out.println(num + " is in position #" + halfWay);
			System.out.println(count);
		} else {
			System.out.println(num + " is not in the list.");
		}
	}
}
