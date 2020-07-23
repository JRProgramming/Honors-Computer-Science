import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Is your range of year within the year 2000 (press 0) or 4000 (press 1)?");
		int range = input.nextInt();
		if(range == 0) {
			System.out.println("Please enter a year between 0 and 2000, inclusive.");
			double dYear = input.nextDouble();
			System.out.println(leapYear2000(dYear));
		} else if(range == 1) {
			System.out.println("Please enter a year between 0 and 4000, inclusive.");
			double dYear = input.nextDouble();
			System.out.println(leapYear4000(dYear));
		}
	}
	public static String leapYear2000(double dYear) {
		boolean valid = dYear == (int)dYear && dYear >= 0 && dYear <= 2000;
		if(valid) {
			int year = (int)dYear;
			boolean leapYear = year%4 == 0 && !(year%100 == 0 && year%400 != 0);
			if(leapYear) {
				return year + " is a leap year.";
			} else {
				return year + " is not a leap year.";
			}
		} else {
			return "Sorry, that was not a valid entry.";
		}
	}
	public static String leapYear4000(double dYear) {
		boolean valid = dYear == (int)dYear && dYear >= 0 && dYear <= 4000;
		if(valid) {
			int year = (int)dYear;
			boolean leapYear = year%4 == 0 && !(year%100 == 0 && year%400 != 0);
			boolean present = year == 2019;
			boolean future = year > 2019;
			boolean past = year < 2019;
			if(leapYear) {
				if(present)
					return year + " is a leap year.";
				else if(past)
					return year + " was a leap year.";
				else if(future)
					return year + " will be a leap year.";
			} else {
				if(present)
					return year + " is not a leap year.";
				else if(future)
					return year + " will not a leap year.";
				else if(past)
					return year + " was not a leap year.";
			}
		}
		return "Sorry, that was not a valid entry.";
	}
}
