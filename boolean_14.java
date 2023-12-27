import java.util.Scanner;

public class boolean_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        boolean res1 = (A > 0 && B <= 0 && C <= 0);
        boolean res2 = (A <= 0 && B > 0 && C <= 0);
        boolean res3 = (A <= 0 && B <= 0 && C > 0);
        boolean result = (res1 || res2 || res3);
        System.out.print(result);
    }
}
