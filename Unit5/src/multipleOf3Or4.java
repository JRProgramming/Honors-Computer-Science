import java.util.Scanner;
public class multipleOf3Or4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer.");
		int integer = input.nextInt();
		boolean multipleOf3 = integer%3 == 0 && integer%4 != 0;
		boolean multipleOf4 = integer%4 == 0 && integer%3 != 0;
		boolean multipleOf3And4 = integer%3 == 0 && integer%4 == 0;
		if(multipleOf3And4) {
			System.out.println(integer + " is multiple of 3 and 4.");
		} else if(multipleOf3) {
			System.out.println(integer + " is multiple of 3 but not 4.");
		} else if(multipleOf4) {
			System.out.println(integer + " is multiple of 4 but not 3.");
		} else {
			System.out.println(integer + " is not multiple of 3 nor 4.");
		}
	}

}
