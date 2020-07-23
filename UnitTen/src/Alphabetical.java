import java.util.Scanner;
public class Alphabetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many names would you like to enter?");
		int num = input.nextInt();
		String[] first = new String[num];
		String[] last = new String[num];
		for(int i=0;i<num;i++) {
			System.out.println("Please enter name " + num + " (first and last).");
			first[i] = input.next();
			last[i] = input.next();
		}
		System.out.println("Please enter “F” to sort by first names or “L” to sort by last names.");
		if(input.next() == "F") {
			for(int i=first.length-1;i>0;i--) {
				for(int j=0;j<i;j++) {
					if(first[i].charAt(j) > first[i].charAt(j+1));
				}
			}
		} else {
			
		}
	}

}
