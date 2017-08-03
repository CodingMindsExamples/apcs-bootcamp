import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		// 1. ask users to input your annual income (double)
		Scanner s = new Scanner(System.in);
		System.out.println("Please input your income: ");
		double income = s.nextDouble();
		double taxRate = 0;
		
		// 2. if your income is > 200,000, your tax rate is 40%; 
		//    if your income is > 100,000   <= 200,000, your tax rate is 30%;
		//    if your income is <= 100,00 > 50,000, your tax rate is 15%;
		//    if your income is <= 50,000, your tax rate is 5%
		
		// e.g. 87000
		if (income > 200000) {
			taxRate = 0.4;
		} else if (income > 100000) {
			taxRate = 0.3;
		} else if (income > 50000) {
			taxRate = 0.15;
		} else {
			taxRate = 0.05;
		}
		
		// 3. print out the tax you need to pay
		System.out.println("You need to pay $" + income * taxRate + " for your tax.");
		
		// if () { }
		// if () { } else { }
		// if () { } else if () { } ... else { }
	}

}
