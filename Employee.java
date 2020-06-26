class Emp
{
	int cid;
	String cna;
	Emp(int cid,String cna)
	{
		this.cid=cid;
		this.cna=cna;
	}	
}

class Commission extends Emp
{
	int sales,perc,comm;
	Commission(int cid,String cna,int sales,int perc)
	{
		super(cid,cna);
		this.sales=sales;
		this.perc=perc;
		comm=(sales*perc)/100;
	}

	void show()
	{
		System.out.println("\n\nID: "+cid+"\nName: "+cna+"\nSales: "+sales+"\nCommission: "+comm);
	}
}	
		
class Perm extends Emp
{
	int salary;
	Perm(int cid,String cna,int salary)
	{
		super(cid,cna);
		this.salary=salary;
	}
}	

class Month extends Perm
{
	int hra,da,totsal;
	Month(int cid,String cna,int salary)
	{
		super(cid,cna,salary);
		hra=(salary*10)/100;
		da=(salary*1)/100;
		totsal=salary+hra+da;
	}

	void show()
	{
		System.out.println("\n\nName: "+cna+"\nHRA: "+hra+"\nDA: "+da+"\nTotal Salary: "+totsal);
	}
}

class Daily extends Perm
{
	int hrs,pay;
	int sal;
	Daily(int cid,String cna,int salary,int hrs,int pay)
	{
		super(cid,cna,salary);
		this.hrs=hrs;
		this.pay=pay;
		sal=hrs*pay;
	}

	void show()
	{
		System.out.println("\n\nID: "+cid+"\nName: "+cna+"\nHours of work: "+hrs+"\nPay per hr: "+pay+"\nDaily salary: "+sal);
	}
}

public class Employee
{
	public static void main(String[] st)
	{
		Commission c=new Commission(035,"Harsh",50,6);
		Month m=new Month(035,"Harsh",50000);
		Daily d=new Daily(035,"Harsh",50000,7,300);
		c.show();
		m.show();
		d.show();
	}
}	