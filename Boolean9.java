import java.util.Scanner;

public class Boolean9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("A ni kiriting: ");
        int A = in.nextInt();

        System.out.print("B ni kiriting: ");
        int B = in.nextInt();

        if (A % 2 != 0 || B % 2 != 0) {
            System.out.println("A va B sonlarning hech bo'lmaganda bittasi toq son.");
        } else {
            System.out.println("A va B sonlar toq emas!");
        }
    }
}
