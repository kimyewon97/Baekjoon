import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        if (A > 0 && A < 10 && B > 0 && B < 10) {
            System.out.printf("%.30f%n", A / B);
        }
    }
}
