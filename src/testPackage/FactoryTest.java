package testPackage;

import org.testng.annotations.Factory;

/**
 * Created by MacUser on 13/03/18.
 */
public class FactoryTest {

    @Factory
    public Object[] createInstance() {
        Object[] result = new Object[10];
        for(int i=0;i<10;i++) {
            result[i] = new WebTest(i*10);
        }
        return result;
    }
}
