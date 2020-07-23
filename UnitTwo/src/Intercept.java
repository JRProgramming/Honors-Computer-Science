import java.util.Scanner;
public class Intercept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2 separated by spaces.");
		int x1 = input.nextInt(), y1 = input.nextInt(), x2 = input.nextInt(), y2 = input.nextInt();
		int slope = (y2-y1)/(x2-x1);
		int intercept = y1 - slope*x1;
		System.out.println("y = " + slope + "x + " + intercept);
	}

}
