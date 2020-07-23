import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers to be summed.  Enter a “0” to indicate the end of the numbers.  Hit the “Enter” button after each entry.");
		int total = 0;
		int entries = 0;
		int newNumber = input.nextInt();
		while(newNumber != 0) {
			entries ++;
			total += newNumber;
			System.out.println((total - newNumber) + " + " + newNumber + " = " + total);
			newNumber = input.nextInt();
			if(newNumber == 0) {
				System.out.println(entries + " entries were made. The sum is " +  total + ".");
			}
		}
	}

}
