import java.util.Scanner;

public class boolean_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        boolean res1 = x1 > 0 && x1 < 9 && y1 > 0 && y1 < 9;
        boolean res2 = x2 > 0 && x2 < 9 && y2 > 0 && y2 < 9;
        boolean res1_2 = res1 && res2;
        boolean res3 = (x1 + y1) % 2 == 0 && (x2 + y2) % 2 == 0;
        boolean res4 = (x1 + y1) % 2 != 0 && (x2 + y2) % 2 != 0;
        boolean result = ((res1_2 && res3) || (res1_2 && res4));
        System.out.print(result);
    }
}
