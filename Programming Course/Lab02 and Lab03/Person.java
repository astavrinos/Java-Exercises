public class Person {
    public static void main(String[] args) {
        Details personOne = new Details("Adamos");


        BankAccount accountOne = new BankAccount(personOne, 00000001, 1000, 10);
        BankAccount accountTwo = new BankAccount(personOne, 00000002, 1000, 20);

        BankAccount b = new Savings(personOne, 1000, 2);

        b.addInterest();

        System.out.println(b);

        // accountOne.setDepositFunds(2000);
        // accountOne.setWithdrawFunds(1999);

        // System.out.println(accountOne.getAccountBalance());


        // System.out.println("Account balance one " + accountOne.getAccountBalance());
        // System.out.println();
        // System.out.println("Account balance two " + accountTwo.getAccountBalance());
        // System.out.println();
        // accountOne.transferFunds(1000, accountTwo);
        // System.out.println("Account balance one " + accountOne.getAccountBalance());
        // System.out.println();
        // System.out.println("Account balance two " + accountTwo.getAccountBalance());
    }
}