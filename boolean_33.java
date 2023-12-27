import java.util.Scanner;

public class boolean_33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean result = ((a + b > c) && (a + c > b) && (b + c > a));
        System.out.print(result);
    }
}
