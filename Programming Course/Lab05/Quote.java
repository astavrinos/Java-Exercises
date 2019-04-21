import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Quote {

    char[] letters = new char[140];
    char[] correctedLetters = new char[letters.length];
    FileReader fr = null;

    public static void main(String[] args) {
        Quote main = new Quote();
        main.startProcess();
    }

    private void startProcess() {
        readFileAndAdd();
        printLetters();
        correctText();
        printCorrectText();
    }

    private void printLetters() {
        System.out.println("\n\nThis is the reverse text: ");
        System.out.println();
        for (int j = 0; j < letters.length; j++) {
            System.out.print(letters[j]);
        }
    }

    private void readFileAndAdd() {
        try {
            fr = new FileReader("backwards.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                for (int i = 0; i < letters.length; i++) {
                    letters[i] = line.charAt(i);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void correctText() {
        char temp = ' ';
        int j = 0;
        while (true) {
            for (int i = letters.length - 1; 0 <= i; i--) {
                temp = letters[i];
                correctedLetters[j] = temp;
                j++;
            }
            break;
        }
    }

    private void printCorrectText() {
        System.out.println("\n\nThis is the correct text: ");
        System.out.println();
        for (int i = 0; i < correctedLetters.length; i++) {
            System.out.print(correctedLetters[i]);
        }
    }
}