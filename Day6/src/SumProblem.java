
public class SumProblem {

	public static void main(String[] args) {
		int sum = 0;
		int counter = 1;
		
		// loop - while		
		while (counter <= 100) {
			sum = sum + counter;
			counter = counter + 2;
		}
		
		System.out.println(sum);
	}

}
