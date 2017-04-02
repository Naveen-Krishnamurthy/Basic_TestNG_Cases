package FactoryMethodTesting;

import org.testng.annotations.Test;

public class DependsFactTesting {
	
	private String value;	
	public DependsFactTesting(String value) {
		this.value=value;
	}
	
	@Test(dependsOnMethods="depFactMethod2")
	public void depFactMethod1() {
		System.out.println("This method depends on 2nd method :"+value+"2");
	}
	
	@Test
	public void depFactMethod2() {
		System.out.println("This is dependent method will be executed first :"+value);
	}

}
