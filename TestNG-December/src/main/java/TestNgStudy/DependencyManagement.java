package TestNgStudy;

import org.testng.annotations.Test;
//
public class DependencyManagement {
	@Test(enabled =false)
	public void Secondary() {

   System.out.println("Study School");
	}
	@Test(dependsOnMethods = "Secondary")
	public void PG() {

		System.out.println("Study Pg");
	}
	@Test (dependsOnMethods = "PG")
	public void Engineering() {

		System.out.println("Study ECE");

	}

}
