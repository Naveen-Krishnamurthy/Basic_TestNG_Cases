package testPackage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by MacUser on 13/03/18.
 */
public class ParametersTest {

    @Parameters("TestParameter")
    @Test
    public void testParameter(String testParameter) {
        System.out.println("Passed Parameter is "+testParameter);
        assert "testParameter".equals(testParameter);
    }

    @Parameters({"FirstName","LastName","DOB"})
    @Test
    public void personalCredentials(String firstName,String lastName,long DOB) {
        System.out.println("Passed Parameter for the test is "+firstName+","+lastName+","+DOB);
        Assert.assertTrue("Naveen".equals(firstName));
        Assert.assertEquals("Krishnamurthy",lastName);
        Assert.assertEquals(10111988,DOB);
    }
}
