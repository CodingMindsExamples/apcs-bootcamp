
public class Loop2 {

	// modify this program to print out all the multiplication table (1-9)
	public static void main(String[] args) {			
		for(int i = 0; i < 10; i = i + 6) {
			System.out.println(i); 
			for(int j = 3; j < 10; j = j + 4) {
				System.out.println(j);  
			}
		}
	}

}
