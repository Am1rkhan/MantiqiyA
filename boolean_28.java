import java.util.Scanner;

public class boolean_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        boolean result = ((x > 0 && y > 0) || (x < 0 && y < 0));
        System.out.print(result);
    }
}
