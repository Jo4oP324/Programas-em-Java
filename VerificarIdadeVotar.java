import java.util.Scanner;
import java.util.Locale;
public class VerificarIdadeVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int idade;

        System.out.print("Digite a idade para verificar a votar: ");
        idade = scanner.nextInt();

        if (idade<16) {
            System.out.println("Voce e menor de idade!");
        }
        else if (idade>=18 && idade<=70) {
            System.out.println("Voce e maior de idade, o voto e obrigatorio");
        }
        else{
            System.out.println("O Voto e facultativo para voce");
        }

        scanner.close();
    }
}
