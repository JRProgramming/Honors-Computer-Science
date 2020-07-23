import java.util.Scanner;
public class RandomDiceRoll {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer and press “Enter” for the first roll.");
		int guess = input.nextInt();
		int firstDie = (int)(Math.random()*6)+1;
		System.out.println("First die: " + firstDie);
		System.out.println("Enter any integer and press enter for the second roll.");
		guess = input.nextInt();
		int secondDie = (int)(Math.random()*6)+1;
		System.out.println("Second die: " + secondDie);
		int max = Math.max(firstDie, secondDie);
		int min = Math.min(firstDie, secondDie);
		if(max != min) {
			System.out.println(max + " beats " + min);
		} else {
			System.out.println(max + " is tied with " + min);
		}
	}

}