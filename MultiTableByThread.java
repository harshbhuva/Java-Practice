class Child6 implements Runnable
{
	Thread th;
	int no;
	Child6(int n)
	{
		th=new Thread(this);
		no=n;
		th.start();
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(" "+no+"*"+i+"= "+(no*i));
			try { Thread.sleep(100); }
			catch(Exception e) {}
		}
		
	}
}
public class MultiTableByThread
{
	public static void main(String[] args) 
	{
		int i;
		int n=Integer.parseInt(args[0]);
		
		for(i=1;i<=n;i++)
		{
			try {
				new Child6(i).th.join();
			}
			catch(Exception e) {}
			
			/*Child6 c=new Child6(i);
			 try { c.th.join(); }
			 catch(Exception e) {} */
		}
	}
}
