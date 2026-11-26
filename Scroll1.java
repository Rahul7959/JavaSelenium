package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll1 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bbc.com/");


int yaxis = driver.findElement(By.xpath("//h2[text()='Innovation']")).getLocation().getY();
Thread.sleep(3000);
JavascriptExecutor j = (JavascriptExecutor)driver;
j.executeScript("window.scrollBy(0,"+yaxis+")");
Thread.sleep(3000);
j.executeScript("window.scrollBy(0,-2000)");
Thread.sleep(3000);
driver.quit();

	}

}
