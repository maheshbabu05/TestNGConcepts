package TestNgStudy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametarization {
	@Test
	@Parameters("Name")
	public void showname(String name) {
		
		System.out.println("Name is" +name);
	}

}
