import java.util.Scanner;

public class boolean_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son = in.nextInt();
        int birlar = son % 10;
        int onlar = son / 10 % 10;
        int yuzlar = son / 100;
        boolean res1 = son > 99 && son < 1000 && birlar != onlar && onlar != yuzlar && birlar != yuzlar;
        boolean res2 = son < -99 && son > -1000 && birlar != onlar && onlar != yuzlar && birlar != yuzlar;
        boolean result = (res1 || res2);
        System.out.print(result);
    }
}
