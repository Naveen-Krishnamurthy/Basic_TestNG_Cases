package FactoryMethodTesting;

import org.testng.annotations.Test;

public class FacTestParameter {
	
	private int testValue;
	
	public FacTestParameter(int testValue) {
		this.testValue=testValue;
	}
	
	@Test
	public void ArgPassMethod1() {
		System.out.println("This is value passed into the system :"+testValue+3);
	}
	
	@Test
	public void ArgPassMethod2() {
		System.out.println("This is value passed into the system 2:"+testValue+4);
	}

}
