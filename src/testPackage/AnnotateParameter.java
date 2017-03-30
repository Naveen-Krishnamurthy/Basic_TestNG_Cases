package testPackage;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotateParameter {
	
	@Parameters("testValue1")
	@Test
	public void passParameter(@Optional("No Value") String value) {
		System.out.println("This is the passed value :"+value);
	}

}
