import java.util.Scanner;
import java.util.Locale;

public class MedidasDeTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        float hp, lp, ha, la, qtd;

        System.out.print("Digita a altura da parede: ");
        hp = scanner.nextFloat();
        System.out.print("Digita a largura da parede: ");
        lp = scanner.nextFloat();
        System.out.print("Digita a altura do azulejo: ");
        ha = scanner.nextFloat();
        System.out.print("Digita a largura do azulejo: ");
        la = scanner.nextFloat();

        qtd = (hp * lp) / (ha * la);

        System.out.println("Quantidade de azulejos necessários para cobrir a parede: " + qtd);

        scanner.close();
    }
}
