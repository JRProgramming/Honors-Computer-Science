import java.util.Scanner;
public class Exponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer for the base.");
		int base = input.nextInt();
		System.out.println("Enter an integer for the power.");
		int power = input.nextInt();
		System.out.println(power(base, power));
	}
	public static int power(int base, int power) {
		int num = base;
		for(int i=0;i<power-1;i++) {
			num*=base;
		}
		return num;
	}

}
