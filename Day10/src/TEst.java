import java.util.Random;

public class TEst {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println(numbers[i]);
		}
		
		Random r = new Random();
		r.nextInt(100);
		for (int j = 1; j<11; j++) {
			numbers[j] = r.nextInt(100);
		}
	}
}
