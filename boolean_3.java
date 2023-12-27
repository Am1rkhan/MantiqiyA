import java.util.Scanner;

public class boolean_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); int A = in.nextInt();
        boolean res = A % 2 == 0 && A != 0;
        System.out.print(res);
    }
}
