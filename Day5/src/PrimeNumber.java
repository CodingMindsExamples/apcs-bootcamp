import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// 1. ask users to input an integer 
		Scanner s = new Scanner(System.in);
		System.out.println("Please input an integer number: ");
		int number = s.nextInt();
		
		// 2. decide whether the integer is a prime number or not
		//    if yes, just print "yes"
		//    if no,  print "no"
		int factor = 2;            
		int flag = 0;
		while(factor <= number - 1) {
			if (number % factor == 0) {
				// set a marker , set a flag
				//System.out.println("Not a prime number, because there is a factor: " + factor);
				flag = 1;
			} 
			factor = factor + 1;
		}
		
		 if (flag == 0) {
			 System.out.println("This is a prime number.");
		 } else {
			 System.out.println("This is not a prime number.");
		 }
		
		
		// 9 / 9
		// number 1,itself
		// 2: 2/1   2/2
		// 3: 3/1   3/3
		// 4: no  4/1 4/2 4/4  
		// % 
	}

}
