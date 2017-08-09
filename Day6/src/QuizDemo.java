import java.util.*;

public class QuizDemo {

	public static void main(String[] args) {
		// 1. Use for loop to give 10 different questions
		
		// 2. Count the number of correct and incorrect answers
		// 3. Print out the correct and incorrect count after the 10 quiz questions
		
		int totalIncorrect = 0;
		int totalCorrect = 0;
		
		for(int i = 0; i < 10; i++) {
			Random r = new Random();
			int a = r.nextInt(100);
			int b = r.nextInt(100);	
			// +   -   *   /
			System.out.println(a + " + " + b + " = ? ");
			
			Scanner s = new Scanner(System.in);
			int answer = s.nextInt();
						
			if (answer == a + b) {
				System.out.println("Correct!");
				totalCorrect++;
			} else { 
				System.out.println("Incorrect!");
				totalIncorrect++;
			}
			
			System.out.println("Total correct: " + totalCorrect);
			System.out.println("Total incorrect: " + totalIncorrect);
		}
		
		
		
	}

}
