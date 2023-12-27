import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class boolean_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son1 = in.nextInt();
        int son2 = in.nextInt();
        int son3 = in.nextInt();
        boolean res1 = (son1 + son2 == 0);
        boolean res2 = (son2 + son3 == 0);
        boolean res3 = (son1 + son3 == 0);
        boolean result = (res1 || res2 || res3);
        System.out.print(result);
    }
}
