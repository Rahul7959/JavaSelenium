package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertation {
@Test
public void verifytitle() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	String expectedtitle="Facebook";
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	if(expectedtitle==actualtitle) {
		System.out.println("Element is found");
	}else {
		System.out.println("Element is not found");
	}
	Thread.sleep(3000);
	driver.quit();
	
}
}
