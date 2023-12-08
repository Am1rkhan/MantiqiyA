import java.util.Scanner;

public class Boolean31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a ni kiriting: ");
        int a = in.nextInt();
        System.out.print("b ni kiriting: ");
        int b = in.nextInt();
        System.out.print("c ni kiriting: ");
        int c = in.nextInt();

        if (a == b && a == c && c == b) {
            if (a + b + c < 180) {
                System.out.println("Teng yonli");
            }
        } else {
            System.out.println("Teng yonli emas!");
        }
    }
}