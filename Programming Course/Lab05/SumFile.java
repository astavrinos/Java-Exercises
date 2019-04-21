import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumFile {
    public static void main(String[] args) {
        SumFile main = new SumFile();
        Scanner sc = new Scanner(System.in);

        try {
            sc = new Scanner(new File("sums.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            int a = sc.nextInt();
            String symbol = sc.next();
            int b = sc.nextInt();

            if (symbol.equals("+")) {
                main.add(a, b);
            } else if (symbol.equals("-")) {
                main.minus(a, b);
            } else if (symbol.equals("*")) {
                main.mult(a, b);
            } else if (symbol.equals("/")) {
                main.div(a, b);
            }
        }

    }

    private void div(int a, int b) {
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }

    private void mult(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }

    private void minus(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    private void add(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }
}