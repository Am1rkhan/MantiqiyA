import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A ni kiriting: ");
        int a = in.nextInt();
        System.out.print("B ni kiriting: ");
        int b = in.nextInt();

        boolean result;
        result = a <= 0 || b < -2;
        System.out.println(result);
    }
}
