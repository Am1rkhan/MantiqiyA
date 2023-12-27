import java.util.Scanner;

public class boolean_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        boolean result = (x > x1 && x < x2 && y > y2 && y < y1);
        System.out.print(result);
    }
}
