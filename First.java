import java.util.Scanner;
public class First 
{

	public static void main(String[] args) 
	{
		int no,f=1;
		/*Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter no: ");
		no=scan.nextInt();*/
		
		no=Integer.parseInt(args[0]);
		
		
		while(no>=1)
		{
			f=f*no;
			no--;
			
		}
		System.out.println("\nFactorial= "+f);
	}

}
