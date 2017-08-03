import java.util.*;

public class StringCompDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input your choice for player 1: (paper, rock, scissors)");
		String player1Choice = s.nextLine();
		System.out.println("Please input your choice for player 2: (paper, rock, scissors)");
		String player2Choice = s.nextLine();
		
		System.out.println("player1: " + player1Choice);
		System.out.println("player2: " + player2Choice);
		
		if ((player1Choice.equals("paper") && player2Choice.equals("rock")) || (player1Choice.equals("rock") && player2Choice.equals("scissors")) || (player1Choice.equals("scissors") && player2Choice.equals("paper"))) {
			System.out.println("Player1 wins");
		}
		if ((player1Choice.equals("paper") && player2Choice.equals("scissors")) || (player1Choice.equals("rock") && player2Choice.equals("paper")) || (player1Choice.equals("scissors") && player2Choice.equals("rock"))) {
			System.out.println("Player1 loses");
		}		
		if (player1Choice.equals(player2Choice)) {
			System.out.println("It's tie");
		}
	}

}
