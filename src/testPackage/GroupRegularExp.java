package testPackage;

import org.testng.annotations.Test;

public class GroupRegularExp {
	
	@Test(groups={"windows.checkinTest","linux.checkinTest"},priority=1)
	public void login() {
		System.out.println("Login to System");
	}
	
	@Test(groups={"windows.checkinTest","linux.checkinTest"},priority=2)
	public void process() {
		System.out.println("Process the system");
	}
	
	@Test(groups={"windows.checkinTest"},priority=3)
	public void Logout() {
		System.out.println("Logout from the System");
	}

}
