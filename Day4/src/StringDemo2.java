
public class StringDemo2 {

	public static void main(String[] args) {
		String str1 = "CS101";
		String str2 = "CS101";
		String str3 = "cs101";
		System.out.println(str1.equals(str3));
		str1 = str1.toLowerCase();
		str3 = str3.toLowerCase();
		System.out.println(str1.equals(str3));
		
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println(str2.startsWith("CS"));
		if (str2.startsWith("CS")) {
			System.out.println("Great, this is a CS course.");
		} else {
			System.out.println("Sorry, this is not.");
		}
	}

}
