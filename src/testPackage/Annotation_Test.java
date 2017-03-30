package testPackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Test {
	
	@Test(groups="Naveen")
	public void firstTestMethod() {
		System.out.println("This is first test method in TestNg");
	}
	
	@Test(expectedExceptions={java.lang.ArithmeticException.class,java.lang.NullPointerException.class}, groups="Girish")
	public void secondTestMethod() {
		System.out.println("This is second test method in TestNg");
		int i=1/0;
	}
	
	@Test(alwaysRun=true, groups="Naveen")
	public void fifthTestMethod() {
		System.out.println("This Method depends on 2nd Test method");
	}
	
	public void beforeClass() {
		System.out.println("This is before the 1st test method of 1st class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after the last test method of 1st class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method will run before each method which belongs to same class(1st class)");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This method will run after each method which bleongs to same class(1st class)");
	}
	
	

}
