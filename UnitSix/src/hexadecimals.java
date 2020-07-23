import java.util.Scanner;
public class hexadecimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a base number (0) or hexadecimal(1)?");
		int command = input.nextInt();
		if(command == 0) {
			System.out.println("Please enter a three digit base number");
			int baseNumber = input.nextInt();
			System.out.println(baseToHexadecimals(baseNumber));
		} else if(command == 1) {
			System.out.println("Please enter a three digit number in hexadecimal");
			String hexa = input.next();
			System.out.println(hexaToBase(hexa));
		} else
			System.out.println("Invalid input.");
	}
	public static int hexaToBase(String hexa) {
		int value = 0;
		char first = hexa.charAt(0);
		char second = hexa.charAt(1);
		char third = hexa.charAt(2);
		int decimal = 0;
		if(first >= 97 && first <= 102) {
			value = first - 87;
			decimal = value*256;
		} else {
			decimal = 16*16*(first-48);
		}
		if(second >= 97 && second <= 102) {
			value = second - 87;
			decimal += value*16;
		} else {
			decimal += 16*(second-48);
		}
		if(third >= 97 && third <= 102) {
			value = third - 87;
			decimal += value;
		} else {
			decimal += third-48;
		}
		return decimal;
	}
	public static String baseToHexadecimals(int base) {
		int firstDigit = (int)(base/Math.pow(16, 2));
		int remainder = base-(int)(firstDigit*Math.pow(16,2));
		int secondDigit = remainder/16;
		remainder -= (secondDigit*16);
		int thirdDigit = remainder;
		String newDigit = "";
		switch (firstDigit) {
		case 10: newDigit += 'a';
		break;
		case 11: newDigit += 'b';
		break;
		case 12: newDigit += 'c';
		break;
		case 13: newDigit += 'd';
		break;
		case 14: newDigit += 'e';
		break;
		case 15: newDigit += 'f';
		break;
		default: if(firstDigit != 0)
			newDigit += (char)(firstDigit+48);
		}
		switch (secondDigit) {
		case 10: newDigit += 'a';
		break;
		case 11: newDigit += 'b';
		break;
		case 12: newDigit += 'c';
		break;
		case 13: newDigit += 'd';
		break;
		case 14: newDigit += 'e';
		break;
		case 15: newDigit += 'f';
		break;
		default: if(secondDigit!= 0)
			newDigit += (char)(secondDigit+48);
		}
		switch (thirdDigit) {
		case 10: newDigit += 'a';
		break;
		case 11: newDigit += 'b';
		break;
		case 12: newDigit += 'c';
		break;
		case 13: newDigit += 'd';
		break;
		case 14: newDigit += 'e';
		break;
		case 15: newDigit += 'f';
		break;
		default: if(thirdDigit != 0)
			newDigit += (char)(thirdDigit+48);
		}
		return newDigit;
	}
}
