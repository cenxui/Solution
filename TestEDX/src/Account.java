
public class Account {
	private double balance;
    private String holder;
    
    /**
     * Constructor Method
     * Create an account with an initial balance for a holder
     */
    public Account (String holder, double initialBalance) {
        this.holder = holder;
        balance = initialBalance;
    }
 
    /**
     * Return the account balance
     */
    public double getBalance() {
        return balance;
    }
 
    /**
     * Return the account holder
     */
    public String getHolder() {
        return holder;
    }
 
    /**
     * Deposit money into the account.
     * @param amount is the money greater than zero to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }
    
    /**
     * Withdraw money from the account.
     * @param amount is the money to withdraw
     * amount must be greater than zero and less 
     * than or equal to balance
     */
    public void withdraw(double amount) {
        balance -= amount;
    }
}
