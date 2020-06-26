class Child1 extends Thread
{
	int i;
	Child1(String s)
	{
		super(s);
		start();
	}
	
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.println(getName()+" === "+i);
			try{ Thread.sleep(500); }
			catch(Exception e) {}
		}
	}
}
class Child2 extends Thread
{
	int i;
	Child2(String s)
	{
		super(s);
		start();
	}
	
	public void run()
	{
		for(i=11;i<=20;i++)
		{
			System.out.println(getName()+" === "+i);
			try{ Thread.sleep(500); }
			catch(Exception e) {}
		}
	}
}
class Child3 extends Thread
{
	int i;
	Child3(String s)
	{
		super(s);
		start();
	}
	
	public void run()
	{
		for(i=21;i<=30;i++)
		{
			System.out.println(getName()+" === "+i);
			try{ Thread.sleep(500); }
			catch(Exception e) {}
		}
	}
}

public class ThreadProg
{

	public static void main(String[] args)
	{
		
		Child1 c1=new Child1("Child 1");
		Child2 c2=new Child2("Child 2");
		Child3 c3=new Child3("Child 3");	
		
	}
}