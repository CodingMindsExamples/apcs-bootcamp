
public class FishExample {

	public static void main(String[] args) {
		double totalFish = 12500;
		int year = 2017;

		while( totalFish >= 2500 ) {			
			// increase the year by 1
			year++;
			// update the totalFish by decreasing it by 22.4%
			totalFish = totalFish * (1 - 0.224);						
			
			System.out.println("Year " + year + " : " + totalFish);
		}
		
		// print out the year and the message
		System.out.println("It's time for actions in the year of " + year);
	}

}
