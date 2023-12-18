package TestNgStudy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteStudy {
	WebDriver Driver;
	
	@BeforeSuite
	public void launch() {
System.setProperty("webdriver.chrome.driver",".chromedriver.exe");
		
		 Driver = new ChromeDriver();
		
	}
	
	
	@Test
	public void openGoogle() {
		Driver.get("https://www.google.com/");
		
		
	}
	@Test
public void openBing() {
		Driver.get("https://www.bing.com/");
		
	}
@Test
public void openfirefox() {
	Driver.get("https://www.edge.org/");
	
}
@AfterSuite
public void close() {
	
//Driver.quit();
	
}

}
