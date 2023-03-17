import java.time.LocalDate;
import java.util.Date;

//10. (The Account class) Design a class named Account that contains:
//         A private int data field named id for the account (default 0).
//         A private double data field named balance for the account (default 0).
//         A private double data field named annualInterestRate that stores the current interest rate
//        (default 0). Assume all accounts have the same interest rate.
//         A private Date data field named dateCreated that stores the date when the account was created.
//         A no-arg constructor that creates a default account.
//         A constructor that creates an account with the specified id and initial balance.
//         The accessor and mutator methods for id, balance, and annualInterestRate.
//         The accessor method for dateCreated.
//         A method named getMonthlyInterestRate() that returns the monthly interest rate.
//         A method named getMonthlyInterest() that returns the monthly interest.
//         A method named withdraw that withdraws a specified amount from the account.
//         A method named deposit that deposits a specified amount to the account. Draw the UML
//        diagram for the class and then implement the class.
public class Account {
    private int id;
    private double balance;
    static private double annualInterestRate;
    private Date dateCreated;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate/100;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate/100;
    }


    public Date getDateCreated() {
        return dateCreated;
    }


    public Account(){
        dateCreated = new Date();
    }
    public Account(int iid, double balancee){
        dateCreated = new Date();
        id=iid;
        balance=balancee;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return getMonthlyInterestRate()*balance;
    }
    public void withdraw(double amount){
        balance-= amount;
        System.out.println("Withdraw Successful, Balance = " + balance);

    }
    public void deposit(double amount){
        balance+= amount;
        System.out.println("Deposit Successful, Balance = " + balance);
    }
    //   A method named withdraw that withdraws a specified amount from the account.
//         A method named deposit that deposits a specified amount to the account.

}
