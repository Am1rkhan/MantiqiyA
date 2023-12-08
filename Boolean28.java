import java.util.Scanner;

public class Boolean28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Koordinatalarni kiriting: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ((x == 1 || x == 3) && (y == 1 || y == 3)) {
            System.out.println("1-chorakda yotadi");
        } else {
            System.out.println("1- yoki 3-chorakda yotmaydi");
        }
    }
}