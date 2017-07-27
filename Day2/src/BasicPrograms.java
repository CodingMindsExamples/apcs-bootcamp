
public class BasicPrograms {
	// compiler
	public static void main(String[] args) {
		int r;		
		System.out.println("Day 2: Variables");
		// f(x) = kx + b
		// s = PI * R * R
		// variable needs a name
		// always declare your variable first		
		r = 5;   // =   assignment 
		System.out.println(r);
		r = 8;
		System.out.println(r);
		r = -50 * 60 - 30 + 200;
		System.out.println(r);
		
		double price;
		price = 14.99;
		System.out.println(price);
		price = 18.99;
		System.out.println(price);
		price = 18.99 * 0.8;
		System.out.println(price);
		price = price * 0.5;   // price = 15.192 * 0.5;
		System.out.println(price);
		
		boolean isGameOver;  // true   false
		isGameOver = false;
		System.out.println(isGameOver);
		isGameOver = true;
		System.out.println(isGameOver);
		
		String name;
		name = "Jim";
		System.out.println(name);
		name = "false";
		System.out.println(name);
		
		long population;		
		float temperature;
		
		int numberOfStudents = 50;
		System.out.println(numberOfStudents);
		String schoolName = "Irvine High School";
		System.out.println(schoolName);
		
		// (F - 32) * 5 / 9
		// use a variable to represent the F
		// you assign 3 different values 
		// for each value, print out the converted degree
		System.out.println("Temperature Conversion Example");
		
		double fahrenheit; 
		fahrenheit = 57;
		
		fahrenheit = (fahrenheit - 32) * ((double)5 / (double)9);
		System.out.println(fahrenheit);
		System.out.println((int)fahrenheit);		
		
		// +, -, *, /
		//    %
		System.out.println(50 % 6);  // 50 / 6 = 8 reminder of 2
		System.out.println(15 % 6);  // 15 / 6 = 2 remainder of 3
		System.out.println(10 % 3);  // 10 / 3 = 3 remainder of 1 
		
		int myNum = 67;
		System.out.println(myNum % 2);
		myNum = 44;
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		System.out.print(10);
		System.out.print(20);
		System.out.print(30);
		System.out.println(40);
		System.out.println(50);
	}
}
