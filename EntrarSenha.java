import java.util.Scanner;
import java.util.Locale;

public class EntrarSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int codigo,senha;

        System.out.print("Insira o codigo de acesso: ");
        codigo = scanner.nextInt();

        if (codigo == 1234) {
            System.out.print("Insira a senha: ");
            senha = scanner.nextInt();
            if (senha == 9999) {
                System.out.println("Login feito com sucesso!");
            }
            else{
                System.out.println("Senha Invalida!");
            }
        }
        else{
            System.out.println("Codigo Invalido!");
        }
        scanner.close();
    }
}