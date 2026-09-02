package fundamentos;

// Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas.

import java.util.Scanner;

public class Exercicio4DiferencaIdade {

    private static final String WELCOME_MESSAGE = "Cálculo de diferença de idade entre duas pessoas.";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);

        System.out.println("Informe o primeiro nome: ");
        String nome1 = scanner.nextLine();

        System.out.printf("Agora informe a idade de %s: \n", nome1);
        int idade1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe o segundo nome: ");
        String nome2 = scanner.nextLine();

        System.out.printf("Agora informe a idade de %s: \n", nome2);
        int idade2 = scanner.nextInt();

        int diferencaIdade = Math.abs(idade1 -idade2);

        System.out.printf("A diferença de idade de %s e %s, é de %d anos.\n", nome1, nome2, diferencaIdade);

        scanner.close();
    }
}
