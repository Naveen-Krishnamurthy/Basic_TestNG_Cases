package testPackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest2 {
	
	@Test(groups="Naveen")
	public void thirdMethod() {
		System.out.println("This is 3rd method from 2nd class");
	}
	
	@Test(groups="Girish")
	public void fourthMethod() {
		System.out.println("This is 4th method from 2nd class");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before the 1st test method of 2nd class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after the last test method of 2nd class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method will run before each method which belongs to same class(2nd class)");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This method will run after each method which bleongs to same class(2nd class)");
	}

}
