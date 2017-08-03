import java.util.*;

public class GameDemo {

	public static void main(String[] args) {
		// while (condition) { 
		//   ...
		// }
		// ....
		
		// 1-Paper, 2-Rock, 3-Sessiors 
		Scanner s = new Scanner(System.in);
		System.out.println("Please input for Player 1 (1-3, input 0 to quit the game): ");
		int player1Choice = s.nextInt();
		
		while(player1Choice != 0) {					
			Random r = new Random();		
			int player2Choice = r.nextInt(3) + 1;			
			
			System.out.println("The Computer chose: " + player2Choice);		
			// Player1 wins: 1-2, 2-3, 3-1  Player1 loses: 1-3, 2-1, 3-2  and &&   or || shift+\ | 		
			// and &&  >>  or || 
			if ((player1Choice == 1 && player2Choice == 2) || (player1Choice == 2 && player2Choice == 3) || (player1Choice == 3 && player2Choice == 1)) {
				System.out.println("Player1 wins");
			}
			if ((player1Choice == 1 && player2Choice == 3) || (player1Choice == 2 && player2Choice == 1) || (player1Choice == 3 && player2Choice == 2)) {
				System.out.println("Player1 loses");
			}		
			if (player1Choice == player2Choice) {
				System.out.println("It's tie");
			}
			
			System.out.println("Please input for Player 1 (1-3, input 0 to quit the game): ");
			player1Choice = s.nextInt();
		}
	}

}
