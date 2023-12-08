import java.util.Scanner;

public class Boolean8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A sonini kiriting: ");
        int A = in.nextInt();
        System.out.print("B sonini kiriting: ");
        int B = in.nextInt();
        
        boolean isRost = (A % 2 != 0) && (B % 2 != 0);
        System.out.println(isRost ? "A va B sonlari toq sonlar." : "A va B sonlari toq sonlar emas.");
    }
}
