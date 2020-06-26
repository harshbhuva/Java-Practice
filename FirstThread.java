
public class FirstThread 
{

	public static void main(String[] args)
	{
		int i;
		
		Thread t=Thread.currentThread();
		
		System.out.println("\nName : "+t.getName());
		t.setName("GTU");
		System.out.println("\nName : "+t.getName());
		System.out.println("\nAlive: "+t.isAlive());
		
		for(i=1;i<=10;i++)
		{
			System.out.println(" "+i);
			try
			{
				Thread.sleep(1000);
				
			}
			catch(Exception e){}
		}
		System.out.println("\nAlive: "+t.isAlive());
	}

}
