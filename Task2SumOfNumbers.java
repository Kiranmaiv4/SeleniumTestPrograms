package javapackage1;

public class Task2SumOfNumbers {

	public static void main(String[] args) {
		
		int []a = {10,111,8989,7876};
		double b = 90.78;
		double result =b;
		for (int i=0;i<a.length;i++)
		{
			result = result+a[i];
		}
		System.out.println("The Sum of five numbers is " +result);

	}

}
