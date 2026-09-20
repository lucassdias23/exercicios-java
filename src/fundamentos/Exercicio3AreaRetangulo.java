package fundamentos;

// Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela o resultado.


import java.util.Scanner;

public class Exercicio3AreaRetangulo {

    private static final String WELCOME_MESSAGE = "Calculando a área de um retângulo.";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);

        System.out.println("Primeiro informe a medida da base: ");
        double base = scanner.nextDouble();

        System.out.println("Agora informe a altura: ");
        double altura = scanner.nextDouble();

        var result = base * altura;

        System.out.printf("A área total é de %.0fm²\n", result);

        scanner.close();
    }
}