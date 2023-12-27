import java.util.Scanner;

public class boolean_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        boolean res1 = (Math.abs(x1 - x2) == 1) && (Math.abs(y1 - y2) == 1);
        boolean res2 = (Math.abs(x1 - x2) == 1) && (y1 == y2);
        boolean res3 = (x1 == x2) && (Math.abs(y1 - y2) == 1);
        boolean move_shah = (res1 || res2 || res3);
        System.out.print(move_shah);
    }
}
