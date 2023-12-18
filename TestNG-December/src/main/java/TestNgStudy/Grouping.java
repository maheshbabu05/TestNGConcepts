package TestNgStudy;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"apple"})
	public void apple1() {
		System.out.println("Apple Gang");
			
	}
	@Test(groups= {"apple"})
	public void apple2() {
		System.out.println("Apple Gang");
		
	}

	@Test(groups= {"ONE"})
	public void OnepLus() {
		
		System.out.println("One Gang");
		
	}

	@Test(groups= {"ONE"})
	public void VIvo() {
		System.out.println("One Gang");
		
	}


}
