import java.util.*;

class Extra implements Runnable
{
	Thread th;
	int a,fac,no,pow,p=1;
	Extra(int fac)
	{
		this.fac=fac;
		th=new Thread(this);
		a=1;
		th.start();
	}
	
	Extra(int no,int pow)
	{
		this.no=no;
		this.pow=pow;
		th=new Thread(this);
		a=2;
		th.start();
	}
	
	public void run()
	{
		if(a==1)
		{
			for(int j=1;j<=fac;j++)
			{
				p=p*j;
			}
			System.out.println("\nFactorial of "+fac+" is "+p);
		}
		
		if(a==2)
		{
			for(int i=1;i<=pow;i++)
			{
				p=p*no;
			}
			System.out.println("\nAnswer of "+no+" to the power "+pow+" is "+p);
		}
		
	}
}

public class FactPower 
{

	public static void main(String[] args)
	{
		int fac,pow,no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find Factorial: ");
		fac=sc.nextInt();
		System.out.println("Enter the number to find power: ");
		no=sc.nextInt();
		System.out.println("Enter the power: ");
		pow=sc.nextInt();
		
		Extra obj1=new Extra(fac);
		Extra obj2=new Extra(no,pow);

	}

}
