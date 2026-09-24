package heranca_polimorfismo.exercicio3_relogio;

import java.util.Scanner;

public class Main {

    private static final String WELCOME_MESSAGE = "=== SISTEMA DE CONVERSÃO DE HORÁRIOS BRL -> US ===\n";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);

        System.out.println("Digite a hora (0-23): ");
        int hora = scanner.nextInt();

        System.out.println("Digite os minutos (0-59): ");
        int minuto = scanner.nextInt();

        System.out.println("Digite os segundos (0-59): ");
        int segundo = scanner.nextInt();

        Clock brlclock = new BRLClock();
        brlclock.setHour(hora);
        brlclock.setMinute(minuto);
        brlclock.setSecond(segundo);

        System.out.println("\nHorário no Brasil: " + brlclock.getTime());

        System.out.println("\nHorário nos EUA: " + new USClock().convert(brlclock).getTime());

        scanner.close();
    }
}
