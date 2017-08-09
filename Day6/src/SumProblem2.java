
public class SumProblem2 {

	public static void main(String[] args) {
		int sum = 0;
		
		// sum = 1, 3, 5, 7, 9, 11, ....., 95, 97, 99
		for(int counter = 1; counter <= 100; counter = counter + 2) {
			sum = sum + counter;
		}
		
		System.out.println(sum);
	}

}
