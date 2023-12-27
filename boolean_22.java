import java.util.Scanner;

public class boolean_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son = in.nextInt();
        int birlar = son % 10;
        int onlar = son / 10 % 10;
        int yuzlar = son / 100;
        boolean incr = son > 99 && son < 1000 && birlar > onlar && onlar > yuzlar;
        boolean decr = son > 99 && son < 1000 && birlar < onlar && onlar < yuzlar;
        boolean result = incr || decr;
        System.out.print(result);
    }
}
