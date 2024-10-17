import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float celsius, fahrenheit, kelvin;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = scanner.nextFloat(); 

        fahrenheit = celsius * 1.8f + 32; 
        kelvin = celsius + 273.15f; 

        System.out.println("A Temperatura em Fahrenheit é: " + fahrenheit);
        System.out.println("A Temperatura em Kelvin é: " + kelvin);

        scanner.close(); 
    }
}
