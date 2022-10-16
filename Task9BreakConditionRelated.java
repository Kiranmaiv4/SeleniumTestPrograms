package javapackage1;

public class Task9BreakConditionRelated {

	public static void main(String[] args) {
		
		int []a= {12,34,66,85,900};
		{
			for(int i=0;i<a.length;i++)
			{
				if (a[i]==85)
				{
					break;
				}
				System.out.println(a[i]);
				
			}
		
		}

	}

}
