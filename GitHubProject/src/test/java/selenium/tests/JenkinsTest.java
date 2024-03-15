package selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsTest {

	WebDriver driver;
	
	
	@Test
	public void firstTest() throws InterruptedException
	{ //hello i am java
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(10 * 1000);
		Thread.sleep(3 * 1000);
		driver.quit();
	}
}
