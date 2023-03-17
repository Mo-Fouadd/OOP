

public class Main {


    //   Hint: The method getMonthlyInterest()     is to return monthly interest, not the interest rate. Monthly interest is balance *
//        monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. Note that
//        annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.) Write a
//        test program that creates an Account object with an account ID of 1122, a balance of
//        $20,000, and an annual interest rate of 4.5%. Use the withdrawal method to withdraw $2,500,
//        use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the
//        date when this account was created.
    public static void main(String[] args) {

        Account a = new Account(1122,20000);
        Account.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println(a.getMonthlyInterest());
        System.out.println(a.getDateCreated());
    }
}