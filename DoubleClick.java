package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		WebElement we  = driver.findElement(By.xpath("//button[text()='No']"));
		Actions a2 = new Actions(driver);
		a2.doubleClick(we).perform();
		Thread.sleep(3000);
		driver.quit();
		
				
	
				

	}

}
