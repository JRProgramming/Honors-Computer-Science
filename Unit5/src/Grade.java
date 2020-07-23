import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int grade = input.nextInt();
		switch (grade)
		{
		case 9: System.out.println("Freshman");
		case 10: System.out.println("Sophomore");
		case 11: System.out.println("Junior");
		case 12: System.out.println("Senior");
		default: System.out.println("Your entry was invalid");
		}
	}
}

