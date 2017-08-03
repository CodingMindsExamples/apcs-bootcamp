
public class WhileDemo1 {

	public static void main(String[] args) {
		// print all the integer numbers from 100 -> 1
		// 100
		// 99
		// ..
		// 1
		
		// variable: int currentNumber
		int currentNumber = 100;
		while(currentNumber >= 1) {
			if (currentNumber % 2 == 1) {
				System.out.println(currentNumber);
			}					
			currentNumber--;  // currentNumber = currentNumber - 1;
			//currentNumber++;  // currentNumber = currentNumber + 1;
		}	
				
	}

}
