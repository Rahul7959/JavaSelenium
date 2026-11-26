package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://www.vtiger.com/");
		WebElement element = driver.findElement(By.id("companyDropdown"));
		Actions a1= new Actions(driver);
		a1.moveToElement(element).perform();
		driver.findElement(By.linkText("Contact Us")).click();
		String add = driver.findElement(By.xpath("//p[contains(text(),'9243602352')]")).getText();
		System.out.println("Mobile Number:"+add);
		Thread.sleep(2000);
		driver.quit();
		
		

		

	}

}
