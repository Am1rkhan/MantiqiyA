import java.util.Scanner;

public class Boolean6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A ni kiriting: ");
        int a = in.nextInt();
        System.out.print("B ni kiriting: ");
        int b = in.nextInt();
        System.out.print("C ni kiriting: ");
        int c = in.nextInt();

        boolean result;
        result = a <= b && b <= c;
        System.out.println(result);
    }
}
