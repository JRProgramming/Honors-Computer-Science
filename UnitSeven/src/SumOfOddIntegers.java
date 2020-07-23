import java.util.Scanner;
public class SumOfOddIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two integers.");
		int first = input.nextInt(), second = input.nextInt();
		int min = Math.min(first, second);
		int originalMin = min;
		int max = Math.max(first, second);
		int sum = 0;
		if(min%2 == 0)
			min ++;
		else 
			min += 2;
		while(min != max && min != (max + 1)) {
			if(min%2 == 1 || min%2 == -1 && min != max) {
				sum += min;
			}
			min += 2;
		}
		System.out.println("The sum of the odd integers between " + originalMin + " " + max + " is equal to " + sum + ".");
	}

}
