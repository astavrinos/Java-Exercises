import java.util.Scanner;

public class TriangleCreation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many? ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }

    }
}