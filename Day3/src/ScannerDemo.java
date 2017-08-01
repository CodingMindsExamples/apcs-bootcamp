import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		System.out.println("Java \"Scanner\" Demo");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please input your name: ");
		String name = s.nextLine();  
		System.out.println("Please input your age: ");
		int age = s.nextInt();  
		System.out.println("Please input your course: ");
		String course = s.next();
		
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("course: " + course);
		
		System.out.println("Please input your grades for all the five courses:");
		int course1 = s.nextInt();
		int course2 = s.nextInt();
		int course3 = s.nextInt();
		int course4 = s.nextInt();
		int course5 = s.nextInt();		
		
		System.out.println("Course1: " + course1);
		System.out.println("Course2: " + course2);
		System.out.println("Course3: " + course3);
		System.out.println("Course4: " + course4);
		System.out.println("Course5: " + course5);
		
		int avgScore = (course1 + course2 + course3 + course4 + course5) / 5;
		System.out.println("Your average score is: " + avgScore);
		boolean isQualified;  // true / false  avgScore  80
		
		// avgScore == 80     : true/false   
		// avgScore >  80     : true/false
		// avgScore <  80     : true/false
		// avgScore >= 80     : true/false 
		// avgScore <= 80     : true/false
		// avgScore != 80     : true/false
		
		isQualified = avgScore >= 80;
		System.out.println("Your qualification status: " + isQualified);
		
		if (avgScore >= 80) {
			System.out.println("Congratulations! You are qualified!");
		}
		if (avgScore < 80) {
			System.out.println("Sorry! You are not qualified");
		}
	}

}
