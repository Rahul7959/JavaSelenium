package Mouse_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");

LoginPage lp=new LoginPage(driver);

lp.enterusername("Rahul Ranjan das");
Thread.sleep(3000);
lp.enterpassword("Rahul@123");
Thread.sleep(2000);
lp.clicklogin();
Thread.sleep(2000);
driver.quit();

	}

}
