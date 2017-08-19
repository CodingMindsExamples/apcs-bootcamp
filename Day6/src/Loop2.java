
public class Loop2 {

	// modify this program to print out all the multiplication table (1-9)
	// 1 - 9
	// 1 - 9
	public static void main(String[] args) {			
		for(int i = 1; i < 10; i = i + 1) {			
			for(int j = i; j < 10; j = j + 1) {
				System.out.println(i + " * " + j + " = " + (i * j));  
			}
		}
	}

}
