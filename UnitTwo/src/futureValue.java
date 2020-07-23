import java.util.Scanner;
public class futureValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the initial value");
		double initValue = input.nextDouble();
		System.out.println("Enter the interest rate as a %, for example, enter 5 for 5%.");
		double intRate = input.nextDouble()/100;
		System.out.println("Enter the number of years");
		double years = input.nextDouble();
		double a = initValue * Math.pow(1 + intRate, years);
		System.out.println("In " + years + " years, the investment will be worth " + a + ".");
	}

}
