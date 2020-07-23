import java.util.Scanner;
public class TypeOfSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of your grade level.");
		int grade = input.nextInt();
		switch(grade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("You are in elementary school.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("You are in middle school.");
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("You are in high school.");
			break;
		case 13:
		case 14:
		case 15:
		case 16:
			System.out.println("You are in college.");
			break;
		default:
			System.out.println("Invalid entry.");
		}
	}

}
