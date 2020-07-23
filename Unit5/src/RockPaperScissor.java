import java.util.Scanner;
public class RockPaperScissor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("User 1 – enter 1 for rock, 2 for paper, 3 for scissors.");
		int user1 = input.nextInt();
		System.out.println("User 2 – enter 1 for rock, 2 for paper, 3 for scissors.");
		int user2 = input.nextInt();
		if(user1 == user2) {
			System.out.println("It's a tie");
		} else {
			boolean rockWin = (user1 == 1 || user2 == 1) && (user2 == 3 || user2 == 3);
			if(rockWin) {
				if(user1 == 1) {
					System.out.println("User 1 wins. Rock covers scissors.");
				} else {
					System.out.println("User 2 wins. Rock covers scissors.");
				}
			} else {
				boolean user1Win = user1 > user2;
				if(user1Win) {
					if(user1 == 2) {
						System.out.println("User 1 wins. Paper covers rock.");
					} else {
						System.out.println("User 1 wins. Scissors covers paper.");
					}
				} else {
					if(user2 == 2) 
						System.out.println("User 2 wins. Paper covers rock.");
					else 
						System.out.println("User 2 wins. Scissors covers paper.");
				}
			}
		}
	}
}