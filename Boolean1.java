import java.util.Scanner;

public class Boolean1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A ni kiriting: ");
        int a = in.nextInt();
        boolean result;
        result = a > 0;
        System.out.println(result);
    }
}