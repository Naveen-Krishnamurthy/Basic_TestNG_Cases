package testPackage;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class StaticDataProvider {
	
	@DataProvider(name="staticProvider")
	public static Object[][] staticDataProvider(Method meth) {
		System.out.println("Test version is :"+meth.getName());
		String testData[][]={{"Naveen","Girish"},{"Test1","Test2"}};
		return testData;
	}

}
