
public class Assignment3 {

	public static void main(String[] args) {
		String str = "abcdefdslfkjslfjsdlfjsldfjslkdfjlsdkghijklmn";
		// "hijklmnabcdefg"		
		int indexOfLastLetter = str.length() - 1;     
		System.out.println(indexOfLastLetter);
		
		String str1 = str.substring(0, indexOfLastLetter / 2 + 1);
		String str2 = str.substring(indexOfLastLetter / 2 + 1, indexOfLastLetter + 1);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str2 + str1);
	}

}
