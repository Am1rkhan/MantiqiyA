import java.util.Scanner;

public class boolean_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        boolean result = A % 2 != 0 && B % 2 != 0 || A % 2 == 0 && B % 2 == 0;
        System.out.print(result);
    }
}
