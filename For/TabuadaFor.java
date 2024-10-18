import java.util.Scanner;
public class TabuadaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multi, resultado;
        System.out.print("Digite um numero para tabuada: ");
        multi = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            resultado = i * multi;
            System.out.println(multi + " x " + i + " = " + resultado);
        }

    }
}
