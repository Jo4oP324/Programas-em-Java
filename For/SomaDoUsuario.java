import java.util.Scanner;
public class SomaDoUsuario{
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           int num1, soma=0;

           System.out.println("Digite um numero N: ");
           num1 = scanner.nextInt();

           for(int i = 1; i <= num1; i++){
            soma += i; 
           }

           System.out.println("A soma dos numeros de 1 ate " + num1 + " e: " +soma);

    }
}