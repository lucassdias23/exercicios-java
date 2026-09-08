package fundamentos;

// Escreva um código que receba o tamanho de um quadrado, calcule sua área, e exiba na tela.

import java.util.Scanner;

public class exercicio2_area_quadrado {

    private static final String WELCOME_MESSAGE = "Calculando a área de um quadrado.";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);

        System.out.println("Informe o tamanho em metros: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;

        System.out.printf("A área total é de %.0fm²\n", area);

        scanner.close();

    }
}
