package Mouse_Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(1000,0)");
Thread.sleep(3000);
js.executeScript("window.scroll(-1000,0)");
Thread.sleep(3000);
driver.quit();
	}

}
