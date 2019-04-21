public class StringFormat {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;

        // String outputA = String.format("%d/%d=%d",a,b,a/b);
        // System.out.println(outputA);
        // String outputB = String.format("6/9=%1.1f", a/ (float)b);
        // System.out.println(outputB);
        // String outputC = String.format("%02d/%02d=%02d",a,b,a/b);
        // System.out.println(outputC);
        // String outputD = String.format("%d/%d=%2.2f",a,b,a/ (float)b);
        // System.out.println(outputD);
        String outputE = String.format("%1.1f/%1.1f=%d",(float)a,(float)b,a/b);
        System.out.println(outputE);
    }
}