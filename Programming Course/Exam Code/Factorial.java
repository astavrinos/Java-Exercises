public class Factorial {

    public static void main(String[] args) {
        Factorial main = new Factorial();

        int value = 5;

        main.calcFactorial(value);
    }

    public void calcFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            System.out.println(result);
        }
        
    }
}