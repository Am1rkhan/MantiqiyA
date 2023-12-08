import java.util.Scanner;

public class Boolean10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("A ni kiriting: ");
        int A = in.nextInt();

        System.out.print("B ni kiriting: ");
        int B = in.nextInt();

        if ((A % 2 != 0 && B % 2 == 0) || (A % 2 == 0 && B % 2 != 0)) {
            System.out.println("Faqat bittasi toq son.");
        } else {
            System.out.println("Faqat bittasi toq son emas.");
        }
    }
}
