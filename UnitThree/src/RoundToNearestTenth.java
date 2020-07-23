import java.util.Scanner;
public class RoundToNearestTenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a double.");
		double num = input.nextDouble();
		int round = (int)(((num*10)%1)/.5);
		num *= 10;
		num += round;
		int ans = (int)num;
		num = ans/10.0;
		System.out.println(num);
	}

}
