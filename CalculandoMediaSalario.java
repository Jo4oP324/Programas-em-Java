import java.util.Scanner;
public class CalculandoMediaSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1,n2,n3,n4,media;

        System.out.print("Digite o primeiro salário: ");
        n1 = scanner.nextFloat();
        System.out.print("Digite o segundo salário: ");
        n2 = scanner.nextFloat();
        System.out.print("Digite o terceiro salário: ");
        n3 = scanner.nextFloat();
        System.out.print("Digite o quarto salário: ");
        n4 = scanner.nextFloat();

        media = (n1+n2+n3+n4)/4;
        
        System.out.println("A media salarial da empresa e: " + media);

        scanner.close();
    }
}
