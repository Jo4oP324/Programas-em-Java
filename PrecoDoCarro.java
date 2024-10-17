import java.util.Scanner;
import java.util.Locale;

public class PrecoDoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        float precoCarro, precoFinal;

        System.out.print("Digite o valor do carro na fábrica R$: ");
        precoCarro = scanner.nextFloat();

        precoFinal = precoCarro + (precoCarro * 0.28f) + (precoCarro * 0.45f);

        System.out.println("O preço que o consumidor deve pagar pelo veículo é de R$: " + precoFinal);

        scanner.close();
    }
}
