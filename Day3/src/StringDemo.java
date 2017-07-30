
public class StringDemo {

	public static void main(String[] args) {
		int a = 100;  // primitive type 
		
		String welcomeMessage = "Welcome#to*CS101";  // object type ***
		String goodbyeMessage = "Good luck on your final exam";
		System.out.println(welcomeMessage);
		System.out.println(goodbyeMessage);
		System.out.println(welcomeMessage + " " + goodbyeMessage);
		
		System.out.println("The length of the welcomeMessage string is: " + welcomeMessage.length());
		System.out.println(goodbyeMessage.length());
		System.out.println(welcomeMessage.toUpperCase());
		System.out.println("The 10th char in welcomeMessage is: " + welcomeMessage.charAt(9));
		System.out.println("The 16th char in welcomeMessage is: " + welcomeMessage.charAt(15));
		System.out.println(goodbyeMessage.toLowerCase());		
		System.out.println(goodbyeMessage.replace("final", "mid-term"));
		
		int v = 10;
		System.out.println(v);
		System.out.println(v - 5);
		v = v - 5;
		System.out.println(v);
		
		System.out.println(welcomeMessage);
		welcomeMessage = welcomeMessage.replace('#', ' ');
		System.out.println(welcomeMessage);
		System.out.println(welcomeMessage.replace('*', ' '));
		welcomeMessage = welcomeMessage.replace('*', ' ');
		System.out.println(welcomeMessage);
		
		System.out.println(welcomeMessage.substring(5, 12));
		
		// Assignment 3
		String mystr = "Java Programming Language";
		// 1. print out the length of the string
		// 2. cut the string in half and reserve the two parts
		// e.g., print out "ming LanguageJava Program"
	}
}
