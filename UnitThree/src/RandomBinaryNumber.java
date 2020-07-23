import java.util.Scanner;
public class RandomBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstNum = (int)(Math.random()*2), secondNum = (int)(Math.random()*2), thirdNum = (int)(Math.random()*2), fourthNum = (int)(Math.random()*2);
		int binaryNumber = firstNum*1000 + secondNum*100 + thirdNum*10 + fourthNum;
		System.out.println(binaryNumber + " Convert to base-10.");
		int guess = input.nextInt();
		int base10 = (int)((firstNum*Math.pow(2, 3)) + (secondNum*Math.pow(2, 2)) + (thirdNum*Math.pow(2,  1)) + (fourthNum*Math.pow(2, 0)));
		System.out.println(binaryNumber + " in binary is equivalent to " + base10 + " in decimal.");
	}

}
