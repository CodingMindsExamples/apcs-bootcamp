import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int[] scores = new int[10];
		
		Scanner s = new Scanner(System.in);
		int sum = 0; 
		for(int i = 0; i < 10; i++) {
			System.out.println("Please input the score for the student No. " + i + ": ");
			scores[i] = s.nextInt();
			sum = sum + scores[i];
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(scores[i]);
		}
		
		// print out the following two pieces of information:
		// 1. the sum of all the scores
		System.out.println("The sum of all the scores is: " + sum);
		// 2. the average of all the scores
		int avg = sum / 10;
		System.out.println("The average of all the scores is: " + avg);
		
		// 3. count and print how many scores are above the avg
		int goodScoreCount = 0;
		for(int i = 0; i < 10; i++) {
			if (scores[i] >= avg) {
				goodScoreCount++;
			}
		}
		
		System.out.println("The total number of good scores is: " + goodScoreCount);
		
		// 4. print the max score among all the 10 scores
		int maxSoFar = Integer.MIN_VALUE;
		for (int i = 0; i < 10; i++) {
			if (scores[i] > maxSoFar) {
				maxSoFar = scores[i];
			}
		}
		System.out.println("The maxSoFar is " + maxSoFar);
		
		// 5. print the min score among all the 10 scores
		int minSoFar = Integer.MAX_VALUE;
		for(int i = 0; i < 10; i++) {
			if (scores[i] < minSoFar) {
				minSoFar = scores[i];
			}
		}
		System.out.println("The min is " + minSoFar);
	}

}
