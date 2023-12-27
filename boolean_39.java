import java.util.Scanner;

public class boolean_39 {
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
        boolean move_ferz = (Math.abs(x1 - x2) == Math.abs(y1 - y2) || x1 == x2 || y1 == y2);
        System.out.print(move_ferz);
    }
}
