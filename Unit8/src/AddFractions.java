import java.util.Scanner;
public class AddFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numerator denominator numerator denominator");
		int num1 = input.nextInt(), den1 = input.nextInt(), num2 = input.nextInt(), den2 = input.nextInt();
		int newNum = num1 * den2;
		int newNum2 = num2 * den1;
		int den = den1*den2;
		int num = newNum+newNum2;
		while(num%2 == 0 && den%2 == 0) {
			num /= 2;
			den /=2;
		}
		while(num%3 == 0 && den%3 == 0) {
			num /= 3;
			den /=3;
		}
		while(num%5 == 0 && den%5 == 0) {
			num /= 5;
			den /= 5;
		}
		System.out.println(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + num + "/" + den);
	}

}
