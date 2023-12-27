import java.util.Scanner;

public class boolean_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son = in.nextInt();
        boolean result = (son > 99 && son < 1000 && son % 2 != 0);
        System.out.print(result);
    }
}
