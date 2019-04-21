public class Savings extends BankAccount {
    public Savings(Person person, int accountNumber, double accountBalance) {
        super(person, accountNumber, accountBalance, accountBalance);
    }

    public String toString() {
        return "Hello";
    }

}