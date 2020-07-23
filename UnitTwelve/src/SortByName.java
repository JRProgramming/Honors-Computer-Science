import java.util.*;
public class SortByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many names would you like to enter?");
		int length = input.nextInt();
		String[] first = new String[length];
		String[] last = new String[length];
		for(int i=0;i<length;i++) {
			System.out.println("Enter name #" + (i+1));
			first[i] = input.next();
			last[i] = input.next();
		}
		System.out.println("Enter 1 to sort by first name.");
		System.out.println("Enter 2 to sort by last name.");
		if(input.nextInt() == 1) {
			sortBy(first, last);
			
		} else {
			sortBy(last, first);
		}
		for(int i=0;i<length;i++) {
			System.out.println(first[i] + " " + last[i]);
		}
	}
	public static void sortBy(String [] x, String [] y) {
		for(int i=x.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(Math.min(x[j].charAt(0), x[j+1].charAt(0)) == x[j+1].charAt(0)) {
					String max = x[j];
					String min = x[j+1];
					x[j] = min;
					x[j+1] = max;
					max = y[j];
					min = y[j+1];
					y[j] = min;
					y[j+1] = max;
				}
			}
		}
	}

}
