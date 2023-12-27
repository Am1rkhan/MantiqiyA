import java.util.Scanner;

public class boolean_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son = in.nextInt();
        boolean result = (son > 9 && son < 100 && son % 2 == 0);
        System.out.print(result);
    }
}
