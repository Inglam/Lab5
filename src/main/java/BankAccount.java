import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName =  name;
        accountType = accountCategory;
        Bank.totalAccounts++;
        /*
         * Implement this function
         */
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(final double a) {
        accountBalance = a;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(final BankAccountType a) {
        accountType = a;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(final double a) {
        interestEarned = a;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(final double a) {
        interestRate = a;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final int a) {
        accountNumber = a;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String a) {
        ownerName = a;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}