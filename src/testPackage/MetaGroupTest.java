package testPackage;

import org.testng.annotations.Test;

/**
 * Created by MacUser on 13/03/18.
 */
public class MetaGroupTest {

    @Test(groups = "windows")
    public void firstTestMethod() {
        System.out.println("First Windows test Method");
    }

    @Test(groups = "linux")
    public void secondTestMethod() {
        System.out.println("Second linux test Method");
    }

    @Test(groups = {"windows","linux"})
    public void thirdTestMethod() {
        System.out.println("Third method for 2 groups for both Windows & Linux");
    }

    @Test(groups = {"Arsenal"})
    public void arsenalTest() {
        System.out.println("This method is only for Arsenal");
    }

}
