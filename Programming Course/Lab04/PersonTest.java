public class PersonTest {
    public static void main(String[] args) {
        Person personOne = new Person("Adamos", 18);
        Person personTwo = new Person("Maria", 22);
        Person personThree = new Person("Sofia", 45);
        Person personFour = new Person("Charis", 78);
        int totalAge =0;
        Person[] people = new Person[4];
        people[0] = personOne;
        people[1] = personTwo;
        people[2] = personThree;
        people[3] = personFour;

        for(int i = 0; i < people.length; i++) {
            totalAge += people[i].getAge();
        }

        System.out.println("The total age of " + people.length + " people is " + totalAge);


        // BankAccount accountOne = new BankAccount(personOne, 00000001, 1000, 10);
        // BankAccount accountTwo = new BankAccount(personOne, 00000002, 1000, 20);

        // BankAccount b = new Savings(personOne, 1000, 2);

        // b.addInterest();

        // System.out.println(b);

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