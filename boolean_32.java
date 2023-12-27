import java.util.Scanner;

public class boolean_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        boolean res1 = (a == Math.sqrt(c * c + b * b));
        boolean res2 = (b == Math.sqrt(c * c + a * a));
        boolean res3 = (c == Math.sqrt(a * a + b * b));
        boolean result = (res1 || res2 || res3);
        System.out.print(result);
    }
}
