import java.util.Scanner;

public class boolean_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        boolean result = (A > 0 && B > 0 && C > 0);
        System.out.print(result);
    }
}
