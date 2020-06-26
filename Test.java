import java.util.*;
class Account{
	 int id;
		 double balance;
		 double annualInterestRate;
		 Date dateCreated;
				 Account(){
			id=0;
			balance=0;
			annualInterestRate=0;
			
		}		 
		Account(int id1, double balance1){
			id=id1;
			balance=balance1;
		}
		void get(int id1, double balance1, double IR1){
			id=id1;
			balance=balance1;
			annualInterestRate=IR1;
		}
		void getdate(){
			dateCreated = new Date();
		}
		
		double getMonthlyInterestRate(){
			return(annualInterestRate/12);
		}
		
		void withdraw(double amount){
			balance -= amount;
		}
		
		void deposit(double amount){
			balance += amount;
		}
		
		void display(){
			System.out.println("id : " + id);
			System.out.println("balance : " + balance);
			System.out.println("interest rate : " + annualInterestRate);
			System.out.println("Date : " + dateCreated);
		}

}

class Test{
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		int id;
		double balance, interestRate,amount;
		String choice;
		System.out.print("\nEnter the id=");
		id=input.nextInt();
		System.out.print("\nEnter the balance=");
		balance=input.nextDouble();
		System.out.print("\nEnter the interest rate=");
		interestRate=input.nextDouble();
		Account obj = new Account(id,balance);
		obj.get(id,balance,interestRate);
		obj.getdate();
		System.out.println("Do you want to withdraw money??");
		choice=input.next();
		if(choice.equals("y")||choice.equals("Y")){
			System.out.println("Enter the amount: ");
			amount=input.nextDouble();
			obj.withdraw(amount);
		}
		
		System.out.println("Do you want to deposit money??");
		choice=input.next();
		if(choice.equals("y")||choice.equals("Y")){
			System.out.println("Enter the amount: ");
			amount=input.nextDouble();
			obj.deposit(amount);
		}
		obj.display();
	}
}
