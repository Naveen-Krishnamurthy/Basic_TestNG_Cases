package testPackage;

import org.testng.annotations.Test;

/**
 * Created by MacUser on 13/03/18.
 */
public class WebTest {
    private int numberOfTimes;
    public WebTest(int numberOfTimes) {
        this.numberOfTimes=numberOfTimes;
    }

    @Test
    public void testServer() {
        for(int i=0;i<numberOfTimes;i++)
            System.out.println("Testing the method : "+i);
    }
}
