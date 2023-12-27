import java.util.Scanner;

public class boolean_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son = in.nextInt();
        int birlar = son % 10;
        int onlar = son / 10 % 10;
        int yuzlar = son / 100;
        boolean result = birlar == yuzlar;
        System.out.print(result);
    }
}
