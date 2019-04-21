import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a number: ");
                String test = sc.nextLine();
                Scanner sc1 = new Scanner(test);
                int i = sc1.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Catched");
            }
        }
    }
}