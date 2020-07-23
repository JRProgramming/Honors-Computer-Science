import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 4 doubles, seperated by spaces.");
		double firstInput = input.nextDouble(), secondInput = input.nextDouble(), thirdInput = input.nextDouble(), fourthInput = input.nextDouble();
		double average = (firstInput + secondInput + thirdInput + fourthInput)/4;
		System.out.println("The average of the four numbers is " + average);
	}
}
