public class BankAccount {
    private String name;
    private int accountNumber;
    private double accountBalance;
    private static int nextAccountNumber;
    private double depositFunds;
    private double withdrawFunds;
    private double interestRate;

    Person person;

    public BankAccount(Person person, int accountNumber, double accountBalance, double interestRate) {
        this.person = person;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.interestRate = interestRate;
        nextAccountNumber++;
    }

    public void transferFunds(double transferAmount, BankAccount account) {
        accountBalance -= transferAmount;
        account.setDepositFunds(transferAmount);
    }

    public void addInterest() {
        accountBalance = accountBalance * (getInterestRate() / 100.0);
        System.out.println("The balance after interest (" + getInterestRate() + ") is " + accountBalance);
    }

    public String toString() {
        return "Name: " + person + "\nAccount number: " + accountNumber + "\nAccount balance: " + accountBalance
                + "\nAccount ID: " + nextAccountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setDepositFunds(double depositFunds) {
        accountBalance += depositFunds;
    }

    public void setWithdrawFunds(double withdrawFunds) {

        if ((accountBalance -= withdrawFunds) <= 0.0) {
            accountBalance -= withdrawFunds;
        } else {
            System.out.println("Cannot withdraw funds.");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

}