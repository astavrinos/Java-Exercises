import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Weighting {
    public static void main(String[] args) {
        double[] array = new double[100];
        double min = 49;
        double max = 50;
        double temp = 0;
        double weighting = 0;
        int i = 0;

        FileReader fr = null;
        Scanner sc;
        try {
            fr = new FileReader("in.txt");
            sc = new Scanner(fr);

            while (sc.hasNextLine()) {
                temp = sc.nextDouble();
                if (temp > max) {
                    max = temp;
                }
                if (temp < min) {
                    min = temp;
                }

                weighting = (temp - min) / (max - min);

                System.out.println("The weight for the number " + temp + " is " + weighting);

                array[i] = temp;
                i++;
            }

            System.out.println("The max is " + max);
            System.out.println("The min is " + min);

        } catch (IOException e) {
            System.out.println("Can not find the file.");
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}