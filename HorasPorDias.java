import java.util.Scanner;
import java.util.Locale;

public class HorasPorDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int segundosPassados, segundosRestantes, totalSegundos, horas, minutos, segundos;

        System.out.print("Digite as horas que se passaram: ");
        horas = scanner.nextInt();
        System.out.print("Digite os minutos que se passaram: ");
        minutos = scanner.nextInt();
        System.out.print("Digite os segundos que se passaram: ");
        segundos = scanner.nextInt();

        segundosPassados = horas * 3600 + minutos * 60 + segundos;
        totalSegundos = 86400; 
        segundosRestantes = totalSegundos - segundosPassados;

        System.out.println("Já se passaram " + segundosPassados + " segundos desde o início do dia.");
        System.out.println("Faltam " + segundosRestantes + " segundos para terminar o dia.");

        scanner.close();
    }
}
