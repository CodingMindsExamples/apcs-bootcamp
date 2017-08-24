import java.util.Random;

public class FinalArray {

	public static void main(String[] args) {
		int[] numbers = new int[10];

		// Step 1: print out every single element in this array using loops
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		
		// Step 2: assign a random integer to every single element in this array using loops
		for(int i = 0; i < 10; i++) {
			Random r = new Random();
			numbers[i] = r.nextInt(100);
		}
		
		// Step 3: print out every single element in this array again using loops
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		
		// Step 4: reverse the whole array using a loop
		for(int i = 0; i < 5; i++) {
			int a = numbers[i];
			numbers[i] = numbers[9 - i];
			numbers[9 - i] = a;
		}
				
		// Step 5:
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		
		System.out.println("The total number of elements in the array: " + numbers.length);
	}

}
