package testPackage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeAfterSet {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before suite for initialization");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("This is before suite for release");
	}
	
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("This is Before test method of classes under suite");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("This is After each test method of classes under suite");
	}
	
}
