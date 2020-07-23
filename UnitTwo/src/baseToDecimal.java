import java.util.Scanner;
public class baseToDecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 2-digit decimal number.");
		int decimal = input.nextInt();
		int originalDecimal = decimal;
		int two_sixth = decimal/64;
		decimal = decimal - 64*two_sixth;
		int two_fifth = decimal/32;
		decimal -= 32*two_fifth;
		int two_fourth = decimal/16;
		decimal -= 16*two_fourth;
		int two_third = decimal/8;
		decimal -=8*two_third;
		int two_second = decimal/4;
		decimal -= 4*two_second;
		int two_first = decimal/2;
		decimal -= 2*two_first;
		int two_zeroth = decimal/1;
		int ans = two_sixth*1000000 + two_fifth*100000 + two_fourth*10000 + two_third*1000 + two_second*100 + two_first*10 + two_zeroth;
		System.out.println("A decimal number of " + originalDecimal + " is equal to " + ans + " in binary numbers.");
	}
}
