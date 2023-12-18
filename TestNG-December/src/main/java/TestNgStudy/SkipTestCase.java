package TestNgStudy;

import org.testng.annotations.Test;

public class SkipTestCase {
	@Test(priority =1 ,enabled=false)
	public void test1() {
		
		System.out.println("Test 001");
	}
	
	@Test()
	public void test2() {
		
		System.out.println("Test 002");
		
	}
	@Test(enabled=false)
	public void test3() {
		
		System.out.println("Test 003");
		
	}

}
