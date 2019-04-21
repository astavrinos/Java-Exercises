import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers main = new PrimeNumbers();

        Scanner sc;
        
        // Try catch because users are not trustworthy. :)
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Enter a number: ");
                int a = sc.nextInt();
                main.checkPrime(a);
            } catch (Exception e) {
                System.out.println("This is not a number...");
            }
        }
    }

    /*
    * This method will check if the number is a prime or not.
    */
    public void checkPrime(int a) {
        if(a % 2 == 0) {
            System.out.println("Number " + a + " is prime number.");
        } else {
            System.out.println("Number " + a + " is not a prime number.");
        }
    }
}