import java.util.Scanner;
public class PingPongGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Player 1's name.");
		String name1 = input.nextLine();
		System.out.println("Enter Player 2's name.");
		String name2 = input.nextLine();
		System.out.println("Who would like you to serve first?");
		System.out.println("Enter 1 for " + name1 + ".");
		System.out.println("Enter 2 for " + name2 + ".");
		System.out.println("Enter 3 for random selection");
		int option = input.nextInt();
		int player1Points = 0;
		int player2Points = 0;
		boolean player1Serve = true;
		if(option == 3) 
			option = (int)(Math.random()*2 + 1);
		if(option == 1) {
			System.out.println(name1 + " will serve first.");
			System.out.println("Score: " + name1 + ", " + player1Points + ", " + name2 + " " + player2Points + ", " + name1 + " serves.");
		}
		if(option == 2) {
			System.out.println(name2 + " will serve first.");
			System.out.println("Score: " + name1 + ", " + player1Points + ", " + name2 + " " + player2Points + ", " + name2 + " serves.");
			player1Serve = false;
		}
		boolean over21Continue = Math.max(player1Points, player2Points) >= 21 && (Math.max(player1Points, player2Points)-1) == Math.min(player1Points, player2Points);
		while(Math.max(player1Points, player2Points) < 21 || over21Continue || player1Points == player2Points) {
			System.out.println("Who scored? Enter 1 for " + name1 + ", enter 2 for " + name2);
			int playerScore = input.nextInt();
			if(playerScore == 1) {
				player1Points ++;
			} else if(playerScore == 2 ) {
				player2Points ++;
			}
			if((player1Points + player2Points)%5 == 0) {
				player1Serve = !player1Serve;
			}
			over21Continue = Math.max(player1Points, player2Points) >= 21 && (Math.max(player1Points, player2Points)-1) == Math.min(player1Points, player2Points);
			boolean victory = !(Math.max(player1Points, player2Points) < 21 || over21Continue || player1Points == player2Points);
			if(!victory) {
				if(player1Serve)
					System.out.println("Score: " + name1 + ", " + player1Points + ", " + name2 + " " + player2Points + ", " + name1 + " serves.");
				else 
					System.out.println("Score: " + name1 + ", " + player1Points + ", " + name2 + " " + player2Points + ", " + name2 + " serves.");
				if(over21Continue || (Math.max(player1Points, player2Points) == 20 && player1Points != player2Points))
					System.out.println("Point serve.");
			}
		}
		System.out.println("Game Over.");
		if(player1Points > player2Points)
			System.out.println(name1 + " wins by a score of " + player1Points + " to " + player2Points + ".");
		else 
			System.out.println(name2 + " wins by a score of " + player2Points + " to " + player1Points + ".");	
	}
}
