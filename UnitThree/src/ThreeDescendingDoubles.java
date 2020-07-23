import java.util.Scanner;
public class ThreeDescendingDoubles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 doubles separated by spaces.");
		double first = input.nextDouble(), second = input.nextDouble(), third = input.nextDouble();
		double firstTwo = Math.max(first, second);
		double highest = Math.max(firstTwo, third);
		firstTwo = Math.min(first, second);
		double lowest = Math.min(firstTwo, third);
		double middle = Math.min(Math.min(Math.max(first, second), Math.max(second, third)), Math.max(first, third));
		//double middle = first + second + third - highest - low;
		System.out.println("In descending order: " + highest + "," + middle + "," + lowest);
		
	}
}
