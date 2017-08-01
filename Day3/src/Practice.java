import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String myInputStr = scanner.nextLine();
		String str = myInputStr;
		
		// String str = "This is the 4th day of the AP CS class.";
		//           " is the 4th day of the AP CS class.This";
		
		int indexOfFirstSpace = str.indexOf(" ");
		String str1 = str.substring(0, indexOfFirstSpace);
		String str2 = str.substring(indexOfFirstSpace, str.length());
		System.out.println(str2 + str1);
	}

}
