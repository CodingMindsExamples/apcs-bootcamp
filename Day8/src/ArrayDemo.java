
public class ArrayDemo {

	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//		int e = 5;
//		//..
//		int y = 25;
//		int z = 26;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		// arrays
		// a 
		int[] myarray = new int[10];  // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		myarray[1] = 5;
		myarray[2] = 9;
		myarray[3] = 12;
		myarray[4] = 10;
		myarray[5] = 15;
		myarray[6] = 29;
		myarray[7] = 312;
		myarray[8] = 410;		
		myarray[9] = 999;
		myarray[0] = 111;
		
//		System.out.println(myarray[0] + myarray[1] + myarray[2] 
//						+ myarray[3] + myarray[4] + myarray[5]
//						+ myarray[6] + myarray[7] + myarray[8]
//						+ myarray[9]);		
		int sum = 0;
		for(int i = 0; i <= 9; i++) {			
			sum = sum + myarray[i];
		}
		System.out.println(sum);
		
		// 1) print the sum of the numbers at the odd index [1] [3] [5] [7] [9]
		// 2) print the sum of the numbers at the even index [0] [2] [6] [8]
	}

}
