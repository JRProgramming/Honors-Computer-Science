import java.util.Scanner;
public class ThreeWordScrambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 words");
		String first = input.next(), second = input.next(), third = input.next();
		int smallestWord = Math.min(Math.min(first.length(), second.length()), third.length());
		int randomPosition = (int)(Math.random()*smallestWord);
		char firstChar = first.charAt(randomPosition);
		char secondChar = second.charAt(randomPosition);
		char thirdChar = third.charAt(randomPosition);
		first = first.substring(0, randomPosition) + secondChar + first.substring(randomPosition + 1);
		second = second.substring(0, randomPosition) + thirdChar + second.substring(randomPosition + 1);
		third = third.substring(0, randomPosition) + firstChar + third.substring(randomPosition + 1);
		System.out.println(first + " " + second + " " + third);
		
	}

}
