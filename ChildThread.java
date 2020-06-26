class Child5 implements Runnable
{
	Thread th;
	int no;
	Child5(int n)
	{
		th=new Thread(this);
		no=n;
		th.start();
	}
	
	public void run()
	{
		for(int i=no;i<no+10;i++)
		{
			System.out.println(th.getName()+" === "+i);
			try{ Thread.sleep(100); }
			catch(Exception e) {}
		}
	}
}


public class ChildThread 
{
	public static void main(String[] args)
	{
		Child5 ch1=new Child5(1);
		
		try{ ch1.th.join(); }
		catch(Exception e) { }
		
		Child5 ch2=new Child5(11);
		try{ ch2.th.join(); }
		catch(Exception e) { }

		Child5 ch3=new Child5(21);

	}

} 