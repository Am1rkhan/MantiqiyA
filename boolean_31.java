import java.util.Scanner;

public class boolean_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean result = (a == b || b == c || a == c);
        System.out.print(result);
    }
}
