import java.util.Scanner;

public class boolean_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        boolean result = x > 0 && x < 9 && y > 0 && y < 9 && (x + y) % 2 != 0;
        System.out.print(result);
    }
}
