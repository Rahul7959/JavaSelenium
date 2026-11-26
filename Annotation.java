package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
@BeforeSuite
public void connecttodatabase() {
Reporter.log("Database connect",true);
}
@BeforeTest
public void Launchbrowser() {
	Reporter.log("browser",true);
	
}
@BeforeMethod
public void login() {
	Reporter.log("login to the application",true);
}
@Test
public void createcustomer() {
	Reporter.log("customer created",true);
}
@AfterMethod
public void logout() {
	Reporter.log("logout to the application",true);
}
@Test
public void deletecustomer() {
	Reporter.log("customer deleted--");
}
@AfterTest
public void closeBrowser() {
	Reporter.log("close browser--");
	
	
	
}
@AfterSuite
public void discount() {
	Reporter.log("Dissconnect to the database--");
	
}
}
