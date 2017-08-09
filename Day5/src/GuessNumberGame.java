import java.util.*;

public class GuessNumberGame {

	public static void main(String[] args) {
		Random r = new Random();
		int targetNumber = r.nextInt(100) + 1;  // 1-100
		int yourNumber = 0;
		// 100
		//   50
		//   25
		//   12
		//   6
		//   3
		//   1
		//   2
		
		// 2,000,000,000
		
		while(true) {			
			Scanner s = new Scanner(System.in);
			yourNumber = s.nextInt();
			if (yourNumber == targetNumber) {
				System.out.println("Congratulations!");
				break;
			}
			if (yourNumber < targetNumber) {
				System.out.println("Too small");
			}
			if (yourNumber > targetNumber) {
				System.out.println("Too big");
			}
		}
		
	}

}
