import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A >= 1 && A <= 10000 && B >= 1 && B <= 10000) {
            System.out.println(A + B);   // A + B
            System.out.println(A - B);   // A - B
            System.out.println(A * B);   // A * B
            System.out.println(A / B);   // A / B
            System.out.println(A % B);   // A % B
        }
    }
}