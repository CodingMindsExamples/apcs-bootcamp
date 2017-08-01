
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
		
		String newStr = "Java programming for AP CS";
		System.out.println(newStr.lastIndexOf('r'));
		System.out.println(newStr.indexOf('r', 15));
		System.out.println(newStr.lastIndexOf("Java"));
		System.out.println(newStr.lastIndexOf("AP"));
		System.out.println(newStr.indexOf("ap cs"));
		
		System.out.println(newStr.startsWith("Java"));
		System.out.println(newStr.endsWith("ap cs"));
		System.out.println(newStr.endsWith("AP CS"));
		
		String newStr2 = "   AP CS A final exam    ";
		System.out.println(newStr2.length());
		System.out.println(newStr2.trim());   //  AP CS A Final exam 
		newStr2 = newStr2.trim();
		System.out.println(newStr2.length());			
	}
}
