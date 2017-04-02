package FactoryMethodTesting;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class StaticDataProviderFactory {
	
	@DataProvider(name="staticProvider")
	public static Object[][] staticDataProvider(Method meth) {
		String testData[][]={{"Naveen","Girish"},{"Test1","Test2"}};
		return testData;
	}

}
