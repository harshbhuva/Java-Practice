class Child8 implements Runnable
{
	Thread th;
	int f;
	Child8(int f)
	{
		this.f=f;
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		for(int i=f;i<=100;i+=2)
		{
			System.out.println(th.getName()+": "+i);
			try { Thread.sleep(500);  }
			catch(Exception e) {}
		}
		/*if(f==1)
		{
			for(int k=1;k<=100;k=k+2)
			{
				System.out.println(th.getName()+": "+k);
			}
		}
		else if(f==2)
		{
			for(int l=2;l<=100;l=l+2)
			{
				System.out.println(th.getName()+": "+l);
			}
		}*/
		
	}
}
public class Odd_Even
{
	public static void main(String[] args)
	{
		Child8 c1=new Child8(1);
		try{ c1.th.join(); }
		catch(Exception e) { }
		Child8 c2=new Child8(2);
	
	}

}