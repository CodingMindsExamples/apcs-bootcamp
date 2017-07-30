
public class CharDemo {

	public static void main(String[] args) {
		char a;
		a = 's';  // "" for String
		char b = '4';
		char c = '+';
		char d = ' ';
		char e = '`';
		char f = 'B';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println((int)a);
		System.out.println((int)b);
		
		char g = 70;
		System.out.println(g);
		char h = 206;
		System.out.println(h);
		System.out.println("==================");
		char i = 600; // unicode ~65536
		System.out.println(i);		
		
		int i1 = 65;
		System.out.println(i1);
		System.out.println((char)i1); 
		
		System.out.println("The ASCII value for a is: " + (int)'a');
		System.out.println("The ASCII char for 88 is: " + (char)88);
		
		System.out.print((char)83);
		System.out.print((char)101);
		System.out.print((char)110);
		System.out.println((char)100);
		
		
		char c1 = 's';
		char c2 = 'y';
		String s1 = "s";
		String s2 = "y";
		System.out.println(c1 + c2);
		System.out.println(s1 + s2);
                             			       // "s" + 'y'
		System.out.println(s1 + c2);   // sy   // "s" + "y" => "sy"  (C)
		                                       // 's' + 'y' => 236   
	}
}
