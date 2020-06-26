class Child7 implements Runnable
{
	Thread th;
	int x,n,no,f;
	Child7(int no,int f)
	{
		th=new Thread(this);
		this.no=no;
		this.f=f;
		th.start();
	}
	
	Child7(int x,int n,int f)
	{
		th=new Thread(this);
		this.x=x;
		this.n=n;
		this.f=f;
		th.start();
	}
	
	public void run()
	{
		int pow=1,fact=1;
		if(f==1)
		{
			while(no>=1)
			{
				fact=fact*no;
				no--;
			}
			System.out.println("\n Factorial is "+fact);
		}
		else if(f==2)
		{
			int i=1;
			while(i<=n)
			{
				pow=pow*x;
				i++;
			}
			System.out.println("\n Power is "+pow);
		}
	}
}


public class Fact_Power 
{

	public static void main(String[] args) 
	{
		int no=Integer.parseInt(args[0]);
		
		int x=Integer.parseInt(args[1]);
		int n=Integer.parseInt(args[2]);
		
		Child7 c1=new Child7(no,1);
		try {  Thread.sleep(500); }
		catch(Exception e)  { }
		Child7 c2=new Child7(x,n,2);
	}

}
