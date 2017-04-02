package FactoryMethodTesting;

import org.testng.annotations.Factory;

public class FactoryClass {
	
	/*@Factory
	public Object[] testFactory1() {
		return new Object[]{new SimpleFactoryTest1(),new SimpleFactoryTest2()};
	}*/
	
	/*@Factory
	public Object[] testFactory2() {
		return new Object[]{new SimpleFactoryTest2(), new SimpleFactoryTest1()};
	}*/
	
	/*@Factory
	public Object[] testParameters() {
		return new Object[]{new FacTestParameter(3),new FacTestParameter(4)};
	}
*/	
	
	@Factory
	public Object[] dependsFactMethods() {
		return new Object[] {new DependsFactTesting("Naveen"), new DependsFactTesting("Girish")};
	}
	

}
