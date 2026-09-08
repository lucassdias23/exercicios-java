package controle;

//Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;

import java.util.Scanner;

public class exercicio3_par_e_impar {

    private static final String WELCOME_MESSAGE = "Bem vindo ao *Par ou Ímpar?*";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);

        System.out.println("Informe o primeiro número: ");
        var n1 = scanner.nextInt();

        System.out.println("Agora, informe um número maior que o primeiro: ");
        var n2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Certo, agora informe se a listagem será par ou ímpar: ");
        var lista = scanner.nextLine().toLowerCase();

        for (var i = n2; i >= n1; i--) {
            if (lista.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (lista.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
            scanner.close();
        }
    }
}

