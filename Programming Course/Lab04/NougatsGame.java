import java.util.Scanner;

public class NougatsGame {
    char[][] dimentions = new char[3][3];
    Scanner sc;

    public static void main(String[] args) {
        NougatsGame main = new NougatsGame();
        main.fillArrayWithSpaces(main.dimentions);
        main.startGame(main.dimentions);
    }

    public void fillArrayWithSpaces(char[][] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                Array[i][j] = ' ';
            }
        }
    }

    public void playerPosition(int row, int column, char a, char[][] Array) {
        while (true) {
            if (Array[row][column] == ' ') {
                Array[row][column] = a;
                break;
            } else {
                System.out.println("Space already taken.");
                if (a == 'x') {
                    playerOneTurn();
                    break;
                } else if (a == 'o') {
                    playerTwoTurn();
                    break;
                }
            }
        }
    }

    public void playerOneTurn() {
        while (true) {
            try {
                System.out.println();
                System.out.println("Player one: ");
                sc = new Scanner(System.in);
                System.out.println("Type row (0-2): ");
                int inputRow = sc.nextInt();
                System.out.println("Type column (0-2): ");
                int inputColumn = sc.nextInt();
                playerPosition(inputRow, inputColumn, 'x', dimentions);
                break;
            } catch (Exception e) {
                System.out.println("Type only numbers.");
            }
        }
    }

    public void playerTwoTurn() {
        while (true) {
            try {
                System.out.println();
                System.out.println("Player two: ");
                sc = new Scanner(System.in);
                System.out.println("Type row (0-2): ");
                int inputRow = sc.nextInt();
                System.out.println("Type column (0-2): ");
                int inputColumn = sc.nextInt();
                playerPosition(inputRow, inputColumn, 'o', dimentions);
                break;
            } catch (Exception e) {
                System.out.println("Type only numbers.");
            }
        }
    }

    public void paint(char[][] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                System.out.print(Array[i][j]);
            }
            System.out.println();
        }
    }

    public void startGame(char[][] Array) {
        while (true) {
            paint(Array);
            playerOneTurn();
            paint(Array);
            playerTwoTurn();
            paint(Array);
        }
    }
}