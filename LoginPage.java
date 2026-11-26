package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	By username= By.name("email");
	By password=By.name("pass");
	By login=By.xpath("//span[text()='Log in']");
	
	public void enterusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	
	}
	public void clicklogin() {
		driver.findElement(login).click();
	}
	
	
	
}
