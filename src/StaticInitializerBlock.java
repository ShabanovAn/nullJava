import java.util.Scanner;

public class StaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int B = scan.nextInt();
        if(H > 0 && B > 0) {
            System.out.println(H+B);
        } else {
            System.out.println("java.lang.Exception: ширина и высота должны быть положительными");
        }
        scan.close();
    }
}
