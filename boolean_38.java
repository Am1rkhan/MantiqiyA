import java.util.Scanner;

public class boolean_38 {
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
        boolean res1 = (Math.abs(x1 - x2) == 1) && (Math.abs(y1 - y2) == 1);
        boolean res2 = (Math.abs(x1 - x2) == 1) && (y1 == y2);
        boolean res3 = (x1 == x2) && (Math.abs(y1 - y2) == 1);
        boolean move_fil = (Math.abs(x1 - x2)) == (Math.abs(y1 - y2));
        System.out.print(move_fil);
    }
}
