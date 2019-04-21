
// import java.util.Arrays;
import java.util.Random;

public class Arrays {
    double[] randomNumbers = new double[100];
    int[] numbers = new int[100];
    Random rand = new Random();

    public static void main(String[] args) {
        Arrays main = new Arrays();
        // main.fillArray(main.rand, main.randomNumbers);
        // main.computeMean(main.randomNumbers);
        main.fillIntArray(main.rand, main.numbers);
        // main.findFirstPosition(main.numbers, 22);
        // main.findLastPosition(main.numbers, 22);

        main.findAllPositions(main.numbers, 22);
    }

    public void computeMean(double[] Array) {
        double temp = 0.0;

        for (int i = 0; i < Array.length; i++) {
            temp += Array[i];
        }
        System.out.println("Mean of the Array is " + temp / Array.length);
    }

    public void fillArray(Random rand, double[] Array) {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = rand.nextDouble();
        }
    }

    public void fillIntArray(Random rand, int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = rand.nextInt(100);
        }
    }

    public void findFirstPosition(int[] Array, int theNumber) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == theNumber) {
                System.out.println("The first occurance of the number " + theNumber + " is in position " + i);
                break;
            }
        }
        System.out.println("Number " + theNumber + " was not found.");
    }

    public void findLastPosition(int[] Array, int theNumber) {
        for (int i = Array.length - 1; i > 0; i--) {
            if (Array[i] == theNumber) {
                System.out.println("The last occurance of the number " + theNumber + " is in position " + i);
                break;
            }
        }
    }

    public void findAllPositions(int[] Array, int theNumber) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == theNumber) {
                System.out.println("The position for the number " + theNumber + " is " + i);
            }
        }
    }
}