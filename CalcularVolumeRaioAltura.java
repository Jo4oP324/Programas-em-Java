import java.util.Scanner;
import java.util.Locale;

public class CalcularVolumeRaioAltura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float volume, raio, altura;

        System.out.print("Digite a altura: ");
        altura = scanner.nextFloat();
        System.out.print("Digite o raio: ");
        raio = scanner.nextFloat();

        volume = (float) (Math.PI * raio * raio * altura);

        System.out.println("O Volume da lata de oleo e: "+ volume);

        scanner.close();
    }
}