class Child extends Thread
{
	int i;
	Child(String s)
	{
		super(s);
		i=10;
		start();
		
	}
	
	public void run()
	{
		for(i=10;i>=1;i--)
		{
			System.out.println(getName()+" === "+i);
			try{ Thread.sleep(500); }
			catch(Exception e) {}
		}
	}
}
public class MyTh
{

	public static void main(String[] args)
	{
		int i;
		
		Child c1=new Child("Dhruvish");
		Child c2=new Child("Kunj");
		Child c3=new Child("Sarika");
		
		
		Thread t=Thread.currentThread();
		
		System.out.println("\nName : "+t.getName());
		
		System.out.println("\nMain: "+t.isAlive());
		System.out.println("\nDhruvish: "+c1.isAlive());
		System.out.println("\nKunj: "+c2.isAlive());
		System.out.println("\nSarika: "+c3.isAlive());

		for(i=1;i<=10;i++)
		{
			System.out.println("Main === "+i);
			try
			{
				Thread.sleep(1000);
				
			}
			catch(Exception e){}
		}
		System.out.println("\nMain: "+t.isAlive());
		System.out.println("\nDhruvish: "+c1.isAlive());
		System.out.println("\nKunj: "+c2.isAlive());
		System.out.println("\nSarika: "+c3.isAlive());	
		
	}
}