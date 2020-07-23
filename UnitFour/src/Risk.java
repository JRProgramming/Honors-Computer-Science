public class Risk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player1Roll1 = (int)(Math.random()*6+1), player1Roll2 = (int)(Math.random()*6+1), player1Roll3 = (int)(Math.random()*6+1);
		int player2Roll1 = (int)(Math.random()*6+1), player2Roll2 = (int)(Math.random()*6+1);
		System.out.println(player1Roll1 + " " + player1Roll2 + " " + player1Roll3);
		System.out.println(player2Roll1 + " " + player2Roll2);
		int player1Max = Math.max(Math.max(player1Roll1, player1Roll2), player1Roll3);
		int player2Max = Math.max(player2Roll1, player2Roll2);
		int player2Min = Math.min(player2Roll1, player2Roll2);
		int player1Min = Math.min(Math.min(player1Roll1, player1Roll2), player1Roll3);
		int player1Mid = player1Roll1 + player1Roll2 + player1Roll3 - (player1Max + player1Min);
		int player1Points = 0, player2Points = 0;
		if(player1Max > player2Max) {
			player1Points += 1;
		} else {
			player2Points += 1;
		}
		if(player1Mid > player2Min) {
			player1Points += 1;
		} else {
			player2Points += 1;
		}
		if(player1Points > player2Points) {
			System.out.println("Attacker Wins Both");
		} else if(player1Points == player2Points) {
			System.out.println("Each Wins One");
		} else {
			System.out.println("Defender Wins Both");
		}
	}

}
