public class BankAccount {
    private String account_number;
    private String account_owner;
    private double balance;

    // Empty constractor
    public BankAccount() {
        this("FI00 0000 0000 0000 00", "owner Undefined", 0.00);
    }

    // Constractor with parameter and initialization
    public BankAccount(String account_number, String account_owner, double balance) {
        this.account_number = account_number;
        this.account_owner = account_owner;
        this.balance = balance;
    }

    // Deposit method to check deposit value and make deposits
    public void deposit(double deposit_amount) {
        if (this.balance + deposit_amount < 0){
            System.out.println("Sorry, you can't deposit negative values!");
        }
        else {
            this.balance = Math.floor((this.balance + deposit_amount) * 1e2) / 1e2;
            System.out.println("deposit of " + deposit_amount +
            "€ made. New balance is " + this.balance + "€");
        }

    }

    // Withdraw method to check withdraw limit and to make a withdraw
    public void withdraw(double withdrawal_amount) {
        if (this.balance - withdrawal_amount < 0){
            System.out.println("Only " + this.balance + "€ available. Withdrawal not processed");
        }
        else{
            this.balance = Math.floor((this.balance - withdrawal_amount) * 1e2) / 1e2;
            System.out.println("Withdrawal of " + withdrawal_amount + "€ processed.");
            System.out.println("Remaining balance = " + this.balance + "€");
        }
    }

    // Print account information 
    public void print() {
        System.out.println("Account Number: " + this.account_number);
        System.out.println("Account owner name: " + this.account_owner);
        System.out.println("Account balance: " + this.balance + "€");
    }



    // setters and getters ⬇︎
    public String getAccount_number() {
        return this.account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_owner() {
        return this.account_owner;
    }

    public void setAccount_owner(String account_owner) {
        this.account_owner = account_owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}