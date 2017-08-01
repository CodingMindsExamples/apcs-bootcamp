import java.util.*;

public class IfDemo {

	public static void main(String[] args) {
		int a = 55;
		int b = 65;
		System.out.println(a + " + " + b + " = ? ");
		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		
		boolean isCorrect = answer == a + b;
		System.out.println("isCorrect: " + isCorrect);
				
		if (isCorrect) {
			System.out.println("Correct!");
			System.out.println("Good job!");
		} else { 
			System.out.println("Incorrect!");
			System.out.println("Try it again!");
		}
		
//		if (answer == a + b) {
//		System.out.println("Correct!");
//	}
//	if (answer != a + b) {
//		System.out.println("Incorrect!");
//	}

	}

}
