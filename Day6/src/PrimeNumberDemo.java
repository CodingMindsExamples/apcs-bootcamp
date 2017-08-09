import java.util.Scanner;

public class PrimeNumberDemo {

	// 1 
	// this is a prime number
	// 2
	// this is a prime number
	// 3 
	// this is a prime number
	// 4
	// this is not a prime number
	
	public static void main(String[] args) {
 		// nested loops
		for(int number = 1; number <= 1000; number++) {		
			
			System.out.println(number);
	
			int factor = 2;            
			int flag = 0;
			while(factor <= number - 1) {
				if (number % factor == 0) {
					flag = 1;
				} 
				factor = factor + 1;
			}
	
			if (flag == 0) {
				System.out.println("This is a prime number.");
			} else {
				System.out.println("This is not a prime number.");
			}
		}
	}

}
