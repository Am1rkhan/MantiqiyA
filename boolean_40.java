import java.util.Scanner;

public class boolean_40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("x1 = ");
        int x1 = in.nextInt();
//        System.out.print("y1 = ");
        int y1 = in.nextInt();
//        System.out.print("x2 = ");
        int x2 = in.nextInt();
//        System.out.print("y2 = ");
        int y2 = in.nextInt();
        boolean res1 = (Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1);
        boolean res2 = (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2);
        boolean move_ot = (res1 || res2);
        System.out.print(move_ot);
    }
}
