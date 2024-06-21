import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id = scanner.next();

        if (id.length() <= 50) {
            System.out.println(id + "??!");
        }
    }
}