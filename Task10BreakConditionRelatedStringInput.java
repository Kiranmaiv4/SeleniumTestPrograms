package javapackage1;

public class Task10BreakConditionRelatedStringInput {

	public static void main(String[] args) {
		
		String[] Languages = {"Java","JavaScript","Selenium","Python","Mukesh"};
		for (int i=0;i<Languages.length;i++)
		{
			if(Languages[i].contains("Selenium"))
			{
				break;
			}
			System.out.println("The languages present before Selenium are "+Languages[i]);
		}

	}

}
