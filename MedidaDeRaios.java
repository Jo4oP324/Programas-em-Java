import java.util.Scanner;
import java.util.Locale;
public class MedidaDeRaios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float raio,area,perimetro;

        System.out.print("Digite a medida de raio em metros: ");
        raio = scanner.nextFloat();

        perimetro = 2*3.14159f*raio;
        area = 3.14159f*raio*raio;

        System.out.println("O perímetro do circulo e: " + perimetro);
        System.out.println("A area do e: "+ area);

        scanner.close();
        
    }
}
