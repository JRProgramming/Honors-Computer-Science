import java.util.Scanner;
public class SumOfSecondAndThirdLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 4 doubles, separated by spaces.");
		double first = input.nextDouble(), second = input.nextDouble(), third = input.nextDouble(), fourth = input.nextDouble();
		double firstTwo = Math.min(first, second);
		double firstThree = Math.min(firstTwo,  third);
		double min = Math.min(firstThree, fourth);
		firstTwo = Math.max(first, second);
		firstThree = Math.max(firstTwo,  third);
		double max = Math.max(firstThree, fourth);
		double sum = (first + second + third + fourth) - (max + min);
		System.out.println("The sum of the 2nd and 3rd largest numbers is " + sum);
	}

}
