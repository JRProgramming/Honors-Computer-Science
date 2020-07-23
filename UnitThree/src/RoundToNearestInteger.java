import java.util.Scanner;
public class RoundToNearestInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a double.");
		double num = input.nextDouble();
		int remainder = (int)((num%1)/.50);
		int ans = (int)(num) + remainder;
		System.out.println(ans);
	}

}
