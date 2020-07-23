import java.util.Scanner;
public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 2 integers.");
		int firstNum = input.nextInt(), secondNum = input.nextInt();
		System.out.println("In ascending order: " + Math.min(firstNum, secondNum) + "," + Math.max(firstNum, secondNum));
		
	}

}
