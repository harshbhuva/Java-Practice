import java.util.Date;

class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }


    void getJoiningDate(){
        System.out.println(this.dateCreated);
    }


    void getAccDetails(){
        System.out.println("\nAccount Id: " + this.id);
        System.out.println("Balance: " + this.balance);
        System.out.println("Annual Interest Rate: " + this.annualInterestRate);
    }


 



   void getAnnualInterestRate(){
        this.annualInterestRate = 4.5;
    }


    void deposit(double amount){
        this.balance += amount;
    }


    void withdraw(double amount){
        this.balance -= amount;
    }
}


class Sample{
    public static void main(String args[]){
        Account first = new Account(1122, 20000.0);

        first.getAnnualInterestRate();
        first.getAccDetails();
        first.getJoiningDate();

        first.deposit(3000.0);
        first.withdraw(2500.0);

        first.getAccDetails();
    }
} 
