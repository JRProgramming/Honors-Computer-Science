import java.util.Scanner;
public class FactorOfFirst {

	public static void main(String[] args) 
	{
	 
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter 2 integers, separated by spaces.  I'll tell you if the second integer is a factor of the first.");
	 int firstNum = input.nextInt();
	 int secondNum = input.nextInt();
	 System.out.println(checkFactor(firstNum, secondNum));
	}
	public static String checkFactor(int num1, int num2){
		if(num1%num2 == 0)
			return num2 + " is a factor of " + num1;
		else
			return num2 + " is not a factor of " + num1;	
	}
}

