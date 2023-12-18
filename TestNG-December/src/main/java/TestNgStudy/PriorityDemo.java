package TestNgStudy;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(priority =1)
	public void orange() {
		System.out.println("Inside Orange");
		
	}
@Test(priority = -1)
	public void red() {
	
	System.out.println("Inside Red");
		
	}
	@Test (priority = 0)
	public void white() {
		
		System.out.println("Inside White");
		
		
		
	}
}


