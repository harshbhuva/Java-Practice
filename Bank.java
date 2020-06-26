class Bank1
{
	int cid,age;
	String cna;
	
	Bank1(String name,int cid,int age)
	{
		cna=name;
		this.cid=cid;
		this.age=age;
	}
	void show()
	{
		System.out.println("ID:"+cid+"Name:"+cna+"Age:"+age);
	}
}

class Current extends Bank1
{
	double op,dep,wid,cl;
	
	Current(String name,int cid,int age, double oa,double dep,double wid)
	{
		super(name,cid,age);
		op=oa;
		this.dep=dep;
		this.wid=wid;
		cl=op+dep-wid;
	}
	
	void show()
	{
		super.show();
		System.out.println("\nOpening amout: "+op+"\nDeposit amount:"+dep+"\nWithdrawal Amount:"+wid+"\nClosing amount:"+cl);
	}
}

class Fixed extends Bank1
{
	double paym,rate,years,mamt,inter;
	
	Fixed(String name,int cid,int age,double p,double r,double y)
	{
		super(name,cid,age);
		paym=p;
		rate=r;
		years=y;
		inter=(paym*rate*years)/100;
		mamt=paym+inter;
	}
	void show()
	{
		super.show();
		System.out.println("\n INTEREST : "+inter);
		System.out.println("\n MATURITY : "+mamt);
	}
}

public class Bank
{
	public static void main(String[] st)
	{
		Current c1=new Current("HARSH",20,20,10000,20000,5000);
		Fixed fd=new Fixed("hariom",21,19,100000,8,5);
		c1.show();
		fd.show();
		
		
	}
}
