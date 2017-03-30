package testPackage;

import org.testng.annotations.Test;

public class GroupTesting {
	
	@Test(groups={"checkIn","functional"})
	public void group1Method() {
		System.out.println("This is group 1 method");
	}
	
	@Test(groups="functional")
	public void group2Method() {
		System.out.println("This is group 2 method");
	}
	
	@Test(groups="checkIn")
	public void group3Method() {
		System.out.println("This is group 3 method");
	}

}
