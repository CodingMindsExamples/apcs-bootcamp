
public class FunctionDemo {

	public static void printStudentInformation(String name, int age) {
		System.out.println("*****************");
		System.out.println("Student name: " + name);
		System.out.println("Student age: " + age);
		System.out.println("*****************");
		System.out.println();
	}
	
	// please complete the following function(method)
	// function name: convertFToC
	// function input: only one F value input, a type of integer
	// function body: print the C value converted from the input F value  (F - 30) / 2
	public static double convertFToC(int F) {
		double c = ((double)F - 30) / 2;
		return c;
		//System.out.println(c);
	}
	
	// 1. Basic Java: Hello World 
	// 2. Variable
	// 3. Types
	// 4. String / char
	// 5. Scanner / Random
	// 6. Conditional - if .. else ..
	// 7. Loops - while
	// 8. Loops - for
	// 9. Arrays 
	// 10. Function (Method)
	
	// 11. Classes/Object
	// 12. Inheritance
	// 13. Polymorphism

	// 14. List 
	// 15. Recursion
	
	public static void main(String[] args) {
		
		double mytemp = convertFToC(98);
		System.out.println("My temp: " + mytemp);
		
//		double d = 3.1415926;
//		d = d * 100;
//		int newd = (int) d;
//		System.out.println((double) newd / 100);
		
		String name1 = "Yu";
		int age1 = 33;
		
		printStudentInformation(name1, age1);				

		String name2 = "Ethan";
		int age2 = 16;
		
		printStudentInformation(name2, age2);
		
		String name3 = "Derek";
		int age3 = 17;
		
		printStudentInformation(name3, age3);
		
		printStudentInformation("Jack", 18);
	}

}
