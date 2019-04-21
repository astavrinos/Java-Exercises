import com.sun.scenario.effect.Blend;

public class Test1 {
    public static void main(String[] args) {
        boolean test;
        boolean a = true;
        boolean b = false;

        System.out.println(test = a && b);
        System.out.println(test = a || b);
        System.out.println(test = a && !b);
        System.out.println(test = !a || b);
        System.out.println(test = !(a && b));
    }
}