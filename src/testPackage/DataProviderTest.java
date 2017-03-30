package testPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="testData")
	public void displayDataproviderData(String value1, String value2, String value3, String value4) {
		System.out.println("Value 1 is :"+value1);
		System.out.println("Value 2 is :"+value2);
		System.out.println("Value 3 is :"+value3);
		System.out.println("Value 4 is :"+value4);	
	}
	
	@Test(dataProvider="staticProvider",dataProviderClass=StaticDataProvider.class)
	public void printStaticDataProvider(String test1, String test2) {
		System.out.println("Static data 1 :"+test1);
		System.out.println("Static data 2 :"+test2);
	}
	
	@Test(dataProvider="staticProvider",dataProviderClass=StaticDataProvider.class)
	public void printStaticDataProvider2(String test1, String test2) {
		System.out.println("Static data 1 :"+test1);
		System.out.println("Static data 2 :"+test2);
	}
	
	
	
	
	@DataProvider(name="testData")
	public Object[][] returnData() {
		String[][] value=new String[3][4];
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=3;j++) {
				value[i][j]="Test"+i+j;
			}
		}
		return value;
	}

}
