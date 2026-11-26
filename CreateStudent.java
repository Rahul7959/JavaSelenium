package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateStudent {
	@Test(groups="Smoke")
	public void createStudent() {
		Reporter.log("Student created",true);
	}
	@Test(invocationCount=5)
	public void updateStudent() {
		Reporter.log("Student will updated",true);
	}
	@Test(groups={"Adhoc","Smoke"})
	public void modifyedstudent() {
		Reporter.log("modifyed student",true);
	}
	@Test
	public void updatestudent() {
		Reporter.log("updated information",true);
	}
	@Test
	public void deletestudent() {
		Reporter.log("student deleted",true);
	}
}
