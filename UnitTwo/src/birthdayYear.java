import java.util.Scanner;
public class birthdayYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the current year.");
		int year = input.nextInt();
		System.out.println("Please enter your age.");
		int age = input.nextInt();
		System.out.println("Have you had your birthday yet this year?  Enter 0 for “Yes”.  Enter 1 for “No”.");
		int birthday = input.nextInt();
		int birthdayYear = year-birthday-age;
		System.out.println("You were born in " + birthdayYear + ".");
	}

}
