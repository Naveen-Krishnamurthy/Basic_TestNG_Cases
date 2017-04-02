package FactoryMethodTesting;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryDataProvider {
	
	private String value1;
	private String value2;
	
	@Factory(dataProvider="staticProvider", dataProviderClass=StaticDataProviderFactory.class)
	public FactoryDataProvider(String value1,String value2) {
		this.value1=value1;
		this.value2=value2;
	}
	
	@Test
	public void displayDataProviderValues1() {
		System.out.println("This is DataProvider value 1: "+value1);
		System.out.println("This is DataProvider value 2: "+value2);
	}
	
	@Test
	public void displayDataProviderValues2() {
		System.out.println("This is DataProvider value 1: "+value1);
		System.out.println("This is DataProvider value 2: "+value2);
	}

}
