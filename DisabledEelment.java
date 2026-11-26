package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class DisabledEelment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//li[.='Disabled']")).click();
WebElement element=		driver.findElement(By.id("name"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		j.executeScript("arguments[0].value='abc@gmail.com' ",element);
		Thread.sleep(3000);
		driver.close();
		
		


	}

}
