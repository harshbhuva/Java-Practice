class Call
{
	synchronized void callMe(String na)
	{
		System.out.print("  [  "+na);
		try {  Thread.sleep(1000);  }
		catch(Exception e)  { 	}
		System.out.println("  ]  ");
	}	
}

class SyncChild implements Runnable
{
	Thread th;
	Call c;
	String na;
	
	SyncChild(String na,Call c)
	{
		th=new Thread(this);
		this.na=na;
		this.c=c;
		th.start();
	}
	public void run()
	{
		c.callMe(na);
	}
}
public class FirstSync 
{

	public static void main(String[] args)
	{
		Call c=new Call();
		SyncChild s1=new SyncChild("Dhruvish",c);
		SyncChild s2=new SyncChild("Dhruvi",c);
		SyncChild s3=new SyncChild("Kunj",c);

	}

}
