package javapackage1;

public class Task3AverageOfNumbers {

	public static void main(String[] args) {
		
		int []a= {10,111,8989,7876};
		double b =90.78;
		double Sum = b;
		double Average =0;
		int TotalNoOfValues =1;
		for(int i=0;i<a.length;i++)
		{
			Sum = Sum+a[i];
			TotalNoOfValues++;
			//System.out.println(Count);
		}
		Average  = Sum/TotalNoOfValues;
		System.out.println("The average value of the numbers is " +Average);

	}

}
