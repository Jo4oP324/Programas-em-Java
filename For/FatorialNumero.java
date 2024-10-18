import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        long fatorial = 1; 
        System.out.print("Digite um numero N: ");
        num1 = scanner.nextInt();

        if (num1 < 0) {
            System.out.println("Fatorial não e definido para numeros negativos.");
        } else {
            for (int i = 1; i <= num1; i++) {
                fatorial *= i; 
            }

            System.out.println("O fatorial de " + num1 + " e: " + fatorial);
        }

    }
}
