import java.util.Scanner;
public class MadMinute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double time = System.currentTimeMillis();
		double current = 0;
		int score = 0;
		while(System.currentTimeMillis() - time < 6000) {
			int firstNum = (int)(Math.random()*9)+1;
			int secondNum = (int)(Math.random()*9)+1;
			System.out.println(firstNum + " + " + secondNum);
			int ans = input.nextInt();
			if(ans == firstNum + secondNum && System.currentTimeMillis() - time < 6000) {
				System.out.println("Correct!");
				score ++;
			} else if(!(System.currentTimeMillis() - time < 6000)) {
				System.out.println("Incorrect!");
			}
		}
		System.out.println("Minute is over");
		System.out.println("You got " + score + " correct");
	}

}
