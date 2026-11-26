package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://www.myntra.com/");
	
		WebElement element = driver.findElement(By.linkText("Men"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(element).perform();

		driver.findElement(By.linkText("T-Shirts")).click();
		Thread.sleep(2000);
		WebElement src =driver.findElement(By.id("rootRail"));
		Thread.sleep(5000);
WebElement dest =driver.findElement(By.id("rootRailThumbRight"));
Thread.sleep(5000);
Actions a = new Actions(driver);
a.dragAndDrop(src, dest).perform();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
