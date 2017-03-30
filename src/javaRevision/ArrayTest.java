package javaRevision;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[2];
		a[0]=1;
		a[1]=2;
		
		//Single dimensional array
		System.out.println("Single Dimensional Array");
		for(int i=0;i<=1;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
//		Multidimensional array
		
		String b[][]=new String[3][4];
		
		System.out.println("Add numbers to Multi dimensional array");
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=3;j++) {
				b[i][j]=i+","+j;
			}
		}
		
		System.out.println("Display the Multi dimensional numbers");
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=3;j++) {
				System.out.print("["+b[i][j]+"] ");
			}
			System.out.println();
		}
		
		
		

	}

}
