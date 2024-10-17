import java.util.Scanner;
import java.util.Locale;

public class ClassificacaoDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int notas;

        System.out.print("Digite sua nota (Entre 0 e 100): ");
        notas = scanner.nextInt();

        if (notas < 0 || notas >100) {
            System.out.println("Nota invalida");
        }
        else if (notas < 50) {
            System.out.println("Reprovado!");            
        }
        else if (notas <=70) {
            System.out.println("Recuperacao!");
        }
        else if (notas<=90) {
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Aprovado com louvor!");
        }
        scanner.close();
    }
}
