package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddStudent {
@Test(priority=1,groups="Smoke")
public void createStudent() {
	Reporter.log("Student created",true);
}
@Test(priority=6)
public void updateStudent() {
	Reporter.log("Student will updated",true);
}
@Test(priority=5)
public void modifyedstudent() {
	Reporter.log("modifyed student",true);
}
@Test(priority=2)
public void updatestudent() {
	Reporter.log("updated information",true);
}
@Test(priority=3)
public void deletestudent() {
	Assert.fail();
	Reporter.log("student deleted",true);
}
}
