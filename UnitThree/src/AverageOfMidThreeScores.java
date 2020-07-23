import java.util.Scanner;
public class AverageOfMidThreeScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 scores");
		double first = input.nextDouble(), second = input.nextDouble(), third = input.nextDouble(), fourth = input.nextDouble(), fifth = input.nextDouble();
		double firstTwo = Math.max(first,  second);
		double lastTwo = Math.max(fourth, fifth);
		double almostMax = Math.max(firstTwo, lastTwo);
		double max = Math.max(almostMax, third);
		firstTwo = Math.min(first,  second);
		lastTwo = Math.min(fourth, fifth);
		almostMax = Math.min(firstTwo, lastTwo);
		double min = Math.min(almostMax, third);
		double score = ((first + second + third + fourth + fifth) - (max + min))/3;
		System.out.println("The score is " + score);
	}

}
