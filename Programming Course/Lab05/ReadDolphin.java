import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDolphin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            sc = new Scanner(new File("dolphin.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}