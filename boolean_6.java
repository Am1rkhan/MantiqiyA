import java.util.Scanner;

public class boolean_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        System.out.print(A <= B && B <= C);
    }
}
