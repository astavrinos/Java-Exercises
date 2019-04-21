public class Savings extends BankAccount {
    public Savings(Details details, int accountNumber, double accountBalance) {
        super(details, accountNumber, accountBalance, accountBalance);
    }

    public String toString() {
        return "Hello";
    }

}