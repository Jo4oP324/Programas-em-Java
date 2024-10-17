import java.util.Scanner;
import java.util.Locale;
public class QuantidadeDeCavalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float quilogramas,metros,segundos,cavalos;

        System.out.print("Digite a massa de quilogramas: ");
        quilogramas = scanner.nextFloat();
        System.out.print("Digite a altura em metros: ");
        metros = scanner.nextFloat();
        System.out.print("Digite a qtd de segundos: ");
        segundos = scanner.nextFloat();

        float gravidade = 9.81f;
        cavalos = (quilogramas*gravidade*metros/segundos)/745.6999f;

        System.out.println("A quantidade de cavalos necessários e: " + cavalos);

        scanner.close();
    }
}
