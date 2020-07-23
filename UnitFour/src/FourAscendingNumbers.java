import java.util.Scanner;
public class FourAscendingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 4 numbers, separated by spaces.");
		double first = input.nextDouble(), second = input.nextDouble(), third = input.nextDouble(), fourth = input.nextDouble();
		double max1 = Math.max(first, second);
		double max2 = Math.max(max1, third);
		double max = Math.max(max2, fourth);
		double min1 = Math.min(first, second);
		double min2 = Math.min(min1, third);
		double min = Math.min(min2, fourth);
		double mid = first + second + third + fourth - max - min;
		double secondHighest = 0;
		double thirdHighest = 0;
		if(max == first) {
			if(min == second) {
				secondHighest = Math.max(third, fourth);
				thirdHighest = Math.min(third, fourth);
			} else if(min == third) {
				secondHighest = Math.max(second, fourth);
				thirdHighest = Math.min(second, fourth);
			} else {
				secondHighest = Math.max(second, third);
				thirdHighest = Math.min(second, third);
			}
		} else if (max == second) {
			if(min == first) {
				secondHighest = Math.max(third, fourth);
				thirdHighest = Math.min(third, fourth);
			} else if(min == third) {
				secondHighest = Math.max(first, fourth);
				thirdHighest = Math.min(first, fourth);
			} else {
				secondHighest = Math.max(first, third);
				thirdHighest = Math.min(first, third);
			}
		} else if (max == third) {
			if(min == first) {
				secondHighest = Math.max(second, fourth);
				thirdHighest = Math.min(second, fourth);
			} else if(min == second) {
				secondHighest = Math.max(first, fourth);
				thirdHighest = Math.min(first, fourth);
			} else {
				secondHighest = Math.max(first, second);
				thirdHighest = Math.min(first, fourth);
			}
		} else {
			if(min == first) {
				secondHighest = Math.max(second, third);
				thirdHighest = Math.min(second, third);
			} else if(min == second) {
				secondHighest = Math.max(first, third);
				thirdHighest = Math.min(first, third);
			} else {
				secondHighest = Math.max(first, second);
				thirdHighest = Math.min(first, second);
			}
		}
		System.out.println("In ascending order, the numbers are " + min + ", "  + thirdHighest + ", " + secondHighest + ", " + max);
		
	}

}
