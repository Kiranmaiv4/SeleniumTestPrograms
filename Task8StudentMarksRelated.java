package javapackage1;

public class Task8StudentMarksRelated {

	public static void main(String[] args) {
		
		int []marks= {78,12,89,55,35};
		System.out.println("The student marks are : "+marks[0]+" "+marks[1]+" "+marks[2]+" "+marks[3]+" "+marks[4]);
		int count=0;
		
		for(int i=0;i<marks.length;i++)
		{
			if (marks[i]>=80)
			{
			    System.out.println("Marks above 80 are " +marks[i]);
			    count++;
			}
		}
		System.out.println("The no.of student who got above 80 marks are "+count);
	}

}
