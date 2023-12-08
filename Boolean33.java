import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a ni kiriting: ");
        int a = in.nextInt();
        System.out.print("b ni kiriting: ");
        int b = in.nextInt();
        System.out.print("c ni kiriting: ");
        int c = in.nextInt();

        if (a+b>c && c+b>a && a+c>b){
            System.out.println("Uchburchak yasash mumkin");
        } else {
            System.out.println("Mumkin emas");
        }
    }
}
