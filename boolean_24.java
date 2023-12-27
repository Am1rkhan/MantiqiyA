import java.util.Scanner;

public class boolean_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextInt();
        double B = in.nextInt();
        double C = in.nextInt();
        double D = B * B - 4 * A * C;
        boolean result = (A != 0 && D >= 0);
        System.out.print(result);
    }
}
