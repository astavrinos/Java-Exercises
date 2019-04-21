public class Arrays2D {
    public static void main(String[] args) {
        int[][] intArray = new int[7][7];

        int x = 1;

        for (int i = intArray.length; i > 1; i--) {// rows

            for (int c = 1; c < x; c++) {
                System.out.print(0 + " ");
            }

            for (int j = 1; j < i; j++) {// columns
                System.out.print(j + " ");
            }

            x++;
            System.out.println();
        }
    }
}