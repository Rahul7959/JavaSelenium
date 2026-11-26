package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
@Test
public void verifypage() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	String  expctedresult="Facebook";
	String actualresult=driver.getTitle();
	Assert.assertEquals(actualresult,expctedresult);
	Thread.sleep(3000);
	driver.quit();
	
	
	
}
}
