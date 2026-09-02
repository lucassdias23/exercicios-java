package controle;

// Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número.

import java.util.Scanner;

public class Exercicio1Tabuada {

    private static final String WELCOME_MESSAGE = "Bem vindo ao sistema de tabuada.";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);

        System.out.println("Para começar, digite um número: ");
        int numero = scanner.nextInt();

        System.out.printf("A tabuada do %d é: \n", numero);

        for (var i = 1; i <= 10; i++) {
            int resultado = numero * i;

            scanner.close();

            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }

    }

}
