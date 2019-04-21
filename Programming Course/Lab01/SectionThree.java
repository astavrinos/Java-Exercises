public class SectionThree {

    final double pi = 3.14;
    public static void main(String[] args) {
        SectionThree main = new SectionThree();
        double r = 5.6;
        main.summariseCircle(r);
    }

    public double compArea(double a) {
        double result = pi * a * a;
        return result;
    }

    public double compCircumference(double a) {
        double result = 2 * pi * a;
        return result;
    }

    public void summariseCircle(double a) {
        System.out.println("CompArea is " + compArea(a) + ". compCircumference is "
        + compCircumference(a) + ".");
    }
}