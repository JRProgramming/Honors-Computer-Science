import java.util.Scanner;
public class flip3Coints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstFlip = (int)(Math.random()*2), secondFlip = (int)(Math.random()*2), thirdFlip = (int)(Math.random()*2);
		int tails = firstFlip + secondFlip + thirdFlip;
		int heads = 3 - tails;
		System.out.println("Heads - " + heads);
		System.out.println("Tails - " + tails);
	}

}
