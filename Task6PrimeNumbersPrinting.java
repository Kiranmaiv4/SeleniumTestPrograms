package javapackage1;

public class Task6PrimeNumbersPrinting {

	public static void main(String[] args) {
		
		for (int i=2;i<=1000;i++)
		{
			int count =0;
			for (int j=2;j<i;j++)
			{
				while(i%j==0)
				{
					count++;
					break;
				}
			}
			
			if(count==0)
			{
				System.out.println(i);
			}
			
		}

	}

}
