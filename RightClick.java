package Mouse_Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.facebook.com/");
WebElement	we	=driver.findElement(By.linkText("Forgotten password?"));

Actions a1 = new Actions(driver);
a1.contextClick(we).perform();
Thread.sleep(2000);
Robot r =  new Robot();
r.keyPress(KeyEvent.VK_T);
Thread.sleep(7000);
driver.quit();

	
		
		


	}

}
