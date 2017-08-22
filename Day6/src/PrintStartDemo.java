
public class PrintStartDemo {

	public static void main(String[] args) {
		//		for(int i = 1; i < 10; i++) {
		//			for(int j = i; j < 10; j++) {
		//				System.out.println(i + " * " + j + " = " + (i * j));
		//			}
		//		}

		// *
		// **
		// ***
		// ****
		// *****

		// use 2 for loops - nested loops
		// you only need the following 2 print statement:		
		// 1) System.out.print("*");
		// 2) System.out.println();

		// *****
		// *****
		// *****
		// *****
		// *****
		// i = 1;   j = [1, 5]   j = [5, 5]     6 - i => 5
		// i = 2;   j = [2, 5]   j = [4, 5]     6 - i => 4
		// i = 3;   j = [3, 5]   j = [3, 5]     6 - i => 3
		// i = 4;   j = [4, 5]   j = [2, 5]     6 - i => 2
		// i = 5;   j = [5, 5]   j = [1, 5]     6 - i => 1

		// *
		// ***
		// *****                                        
		// *******                                      
		// *********
		for(int i = 0; i <= 4; i++) {   
			for(int k = 0; k < 4 - i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i * 2 + 1; j++) {	
				System.out.print("*");
			}
			System.out.println();
		}

		//     *
		//    ***
		//   *****                                        
		//  *******                                      
		// *********
		// System.out.print(" ");
	}

}
