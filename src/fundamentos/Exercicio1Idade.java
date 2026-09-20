package fundamentos;

// Escreva um código que receba o nome e o ano de nascimento de alguém, e imprima na tela uma mensagem contendo o nome e em seguida a idade.

import java.util.Scanner;

public class Exercicio1Idade {

    private static final String WELCOME_MESSAGE = "Olá, vamos calcular a sua idade?";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);

        System.out.println("Primeiro, preciso que você informe o seu nome: ");
        var name = scanner.nextLine();

        System.out.println("Agora, informe o seu ano de nascimento: ");
        var year = scanner.nextInt();
        var currentYear = 2026 - year;

        System.out.printf("%s, a sua idade é de %s anos.\n", name, currentYear);

        scanner.close();
    }
}