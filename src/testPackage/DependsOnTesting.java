package testPackage;

import org.testng.annotations.Test;

public class DependsOnTesting {
	
	@Test
	public void Method1() {
		System.out.println("This is Test method 1");
	}
	
	@Test
	public void Method2() {
		System.out.println("This is Method 2");
		int i=1/0;
	}
	
	@Test(dependsOnMethods="Method2")
	public void Method3() {
		System.out.println("This is Method 3");
	}
	
	@Test(groups="testng.first")
	public void Method4() {
		System.out.println("This belongs to testng.first");
	}
	
	@Test(groups="testng.second")
	public void Method5() {
		System.out.println("This belongs to testng.second");
		int i=1/0;
	}
	
	@Test(groups="testng.third")
	public void Method6() {
		System.out.println("This belongs to testng.third");
	}
	
	@Test(dependsOnGroups="testng.*")
	public void Method7() {
		System.out.println("This depends on Above group");
	}

}
