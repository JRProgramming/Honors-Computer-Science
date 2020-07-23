import java.util.Scanner;
public class Under100MultiplicationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstNum = (int)(Math.random()*19 + 1); //[1, 20) only allows value from 1-19
		int biggest = (int)(98/firstNum); //Biggest number that could be multiplied by the first term so that the product would be under 100
		int max = Math.min(biggest, 20); //Since the second term could only be from the range of 1-19, you have to take whatever is smaller from 1-19
		int min = (int)(10/firstNum)+1; //Smallest number that could be multiplied by the first term so that the product will be above 10 (can't be 0)
		int secondNum = (int)(Math.random()*(max-min+1)+min); 
		System.out.println(firstNum + "*" + secondNum);
		int guess = input.nextInt();
		System.out.println("The answer is " + firstNum*secondNum + ".");
	}
}
