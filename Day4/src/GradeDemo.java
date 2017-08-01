import java.util.*;

public class GradeDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input your grade (0-100): ");
		int grade = s.nextInt();
		if (grade >= 90) {
			System.out.println("A");
		}
		if (grade >= 80 && grade <= 89) {    // 80 <= grade <= 89  
			System.out.println("B");
		}
		if (grade >= 70 && grade <= 79) {    // 70, 79
			System.out.println("C");
		}
		if (grade >= 60 && grade <= 69) {    // 60, 69
			System.out.println("D");
		}
		if (grade < 60) {
			System.out.println("F");
		}
	}

}
