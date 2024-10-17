import java.util.Scanner;
import java.util.Locale;
public class ClassifcacaoDeIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int idade;

        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();

        if (idade < 12) {
            System.out.println("Voce e crianca!");
        }
        else if (idade >= 12 && idade <= 17) {
            System.out.println("Voce e adolescente!");
        }
        else if (idade >=18 && idade <= 59) {
            System.out.println("Voce e adulto!");
        }
        else{
            System.out.println("Voce e idoso!");
        }
        scanner.close();
    }
}
