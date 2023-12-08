import java.util.Scanner;

public class Boolean7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A sonini kiriting: ");
        int A = in.nextInt();
        System.out.print("B sonini kiriting: ");
        int B = in.nextInt();
        System.out.print("C sonini kiriting: ");
        int C = in.nextInt();

        boolean isTrue = (B > A) && (B < C);
        System.out.println(isTrue ? "B soni A va C sonlari orasida yotadi." : "B soni A va C sonlari orasida yotmaydi.");
    }
}
