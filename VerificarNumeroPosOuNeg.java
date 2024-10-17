import java.util.Scanner;
import java.util.Locale;
public class VerificarNumeroPosOuNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int numero;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();


        if (numero == 0) {
            System.out.println("E igual a zero!");
        }
        else if (numero > 0) {
            System.out.println("E Positivo");
        }
        else if (numero < 0) {
            System.out.println("E Negativo");
        }
        
        scanner.close();
    }
}
