import java.util.*;

class InvalidMarksException extends Exception
{
	int marks;
	InvalidMarksException(int a)
	{
		marks=a;
	}

	public String toString()
	{
		return"Invalid marks "+marks+" has been caught";
	}
}

public class CusExc
{
	public static void main(String []st)
	{
		int marks;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks: ");
		marks=scan.nextInt();
		try
		{
			if(marks<0 || marks>100)
			{
				throw new InvalidMarksException(marks);
			}
			else
				System.out.println("\nValid Marks");
		}
		catch(InvalidMarksException na)
		{
			System.out.println(na);
		}
	}
}	