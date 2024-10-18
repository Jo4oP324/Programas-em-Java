
import java.util.Scanner;

public class FatorialFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.print("Digite um numero N:");
        num1 = scanner.nextInt();

        for (int i = 1; i <= num1; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }

    }
}
