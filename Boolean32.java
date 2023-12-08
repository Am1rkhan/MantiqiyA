import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a ni kiriting: ");
        int a = in.nextInt();
        System.out.print("b ni kiriting: ");
        int b = in.nextInt();
        System.out.print("c ni kiriting: ");
        int c = in.nextInt();

        if (a == 90 || b == 90 || c == 90) {
            if (a + b + c < 180) {
                System.out.println("To'g'ri burchakli uchburchak");
            }
        }else {
            System.out.println("To'g'ri burchakli uchburchak emas!");
        }
    }
}
