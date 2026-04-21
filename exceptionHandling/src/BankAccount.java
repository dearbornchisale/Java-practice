import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<String> transactionHistory = new ArrayList<>();

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) throws NegativeDepositException {

        if (amount < 0) {
            throw new NegativeDepositException("Cannot deposit a negative amoount!!");
        }

        balance += amount;
        transactionHistory.add("Deposited R" + amount + " Available balance is R" + balance);
    }

    public void withdraws(double amount) throws InsufficientFundsException {

        if (amount >= balance) {
            throw new InsufficientFundsException("You have insufficient funds :(. Available: " + balance);
        }

        balance -= amount;
        transactionHistory.add("Withdrawn  R" + amount + ". Available balance is R" + balance);

    }

    public void transfer(BankAccount recipient, double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Invalid transaction amount !:(");
        }else if(amout > balance){
            throw new InvalidTransactionException("Insufficient funds to transfer :(");
        }

        this.balance -= amount;
        recipient.balance += amount
        
        transactionHistory.add("Successfully transferred R" + amount + " to " + recipient.getAccountHolder());
    }

    public void displayTransactionHistory() {
        
        for(String transaction : transactionHistory){
            System.out.print(transactionHistory);
        }
        
    }

}
