import java.util.Scanner;
public class Taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have your annual income (enter 0) or your tax paid (enter 1)?" );
		double userInput = input.nextDouble();
		if(userInput == 0) {
			System.out.println("Please enter your annual income.");
			double income = input.nextDouble();
			System.out.println(incomeToTax(income));
		} else if(userInput == 1) {
			System.out.println("Please enter your tax that you paid.");
			double tax = input.nextDouble();
			System.out.println(taxToIncome(tax));
		} else 
			System.out.println("Invalid entry.");
	}
	public static String taxToIncome(double tax) {
		double income = 0;
		boolean invalid = tax < 0;
		boolean noTax = tax == 0;
		boolean tenPercent = tax <= 10000;
		boolean twentyPercent = tax > 10000 && tax <= 30000;
		boolean thirtyPercent = tax > 30000;
		if(tax < 0)
			return "Invalid Entry!";
		if(tax == 0)
			income = 0;
		else if(tenPercent)
			income = tax*10;
		else if(twentyPercent)
			income = ((tax-10000)/2)*10+100000;
		else 
			income = ((tax-30000)/3)*10+200000;
		return "Your income was less than or equal to $" + income + ".";
	}
	public static String incomeToTax(double income) {
		boolean negative = Math.abs(income) != income;
		boolean tenPercent = 100000 >= income && income >= 0;;
		boolean twentyPercent = 100000 < income && 200000 >= income;
		boolean thirtyPercent = income > 200000;
		double taxes = 0;
		if(tenPercent)
			taxes = 0.1*income;
		else if(twentyPercent)
			taxes = 10000 + .2*(income - 100000);
		else if(thirtyPercent)
			taxes = 30000 + .3*(income - 200000);
		return "The taxes on " + income + " are $" + taxes  + ".";
		
	}
}

