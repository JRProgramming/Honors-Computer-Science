import java.util.Scanner;
public class NoRemainderDivisionn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int randomNum1 = (int)(Math.random()*8)+2, dividingNumber = (int)(Math.random()*10);
		int firstNum = randomNum1*dividingNumber + (int)(Math.random()*(dividingNumber-1)+1);
		System.out.println(firstNum + " / " + dividingNumber);
		System.out.println("Enter the integer portion.");
		int integer = input.nextInt();
		System.out.println("Enter the remainder.");
		int remainder = input.nextInt();
		System.out.println("The correct answer is " + (firstNum/dividingNumber) + ", remainder " + (firstNum%dividingNumber));
	}

}
