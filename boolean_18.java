import java.util.Scanner;

public class boolean_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son1 = in.nextInt();
        int son2 = in.nextInt();
        int son3 = in.nextInt();
        boolean result = (son1 == son2 || son2 == son3 || son1 == son3);
        System.out.print(result);
    }
}
