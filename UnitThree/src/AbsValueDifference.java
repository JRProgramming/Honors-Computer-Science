import java.util.Scanner;
public class AbsValueDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 2 doubles.");
		double firstDouble = input.nextDouble(), secondDouble = input.nextDouble();
		double difference = Math.abs(firstDouble - secondDouble);
		System.out.println("The difference between the numbers is " + difference);
	}

}
