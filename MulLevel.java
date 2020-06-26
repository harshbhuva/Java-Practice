interface A
{
	int i=10;
}

interface B extends A
{
	int j=20;
	
}

class C implements B
{
	void display()
	{
		System.out.println("I= "+i);
		System.out.println("J= "+j);
	}
}

public class MulLevel
{
	public static void main(String[] args)
	{
		C c1=new C();
		c1.display();

	}
}
