import java.util.Locale;
import java.util.Scanner;
public class CalculadoraSimples{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        char operacao;
        float num1, num2,resultado;

        System.out.print("Digite o operador para calcular ('+','-','*','/'): ");
        operacao = scanner.next().trim().charAt(0);

        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextFloat();
        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextFloat();
        
        if(operacao == '+'){
            resultado=num1+num2;
            System.out.println("O Resultado da soma e: "+resultado);
        }
        else if (operacao == '-'){
            resultado=num1-num2;
            System.out.println("O Resultado da subtracao e: "+resultado);
        }
        else if (operacao == '*'){
            resultado=num1*num2;
            System.out.println("O Resultado da multiplicacao e: "+resultado);
        }
        else if (operacao == '/'){
            if(num2!=0){
                resultado=num1/num2;
                System.out.println("O Resultado da divisao e: "+resultado);    
            }
            else{
                System.out.println("Erro: Divisao por zero!");
            }
         }
        else{
            System.out.println("Operacao Invalida!");
        }
    }
}