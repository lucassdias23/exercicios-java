package controle;

//Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados


import java.util.Scanner;

public class Exercicio4Divisao {

    private static final String WELCOME_MESSAGE = "Bem vindo ao Divisão";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);

        System.out.println("Informe um número: ");
        int num = scanner.nextInt();

        while (true) {
            System.out.println("Agora informe outro número (não sendo menor que o primeiro): ");
            int num2 = scanner.nextInt();
            if (num2 < num) {
                System.out.println("Número menor que o inicial. Ignorado!");
                continue;
            }

            if (num2 % num != 0) {
                System.out.println("Encontrado número com resto diferente de Zero. Encerrando!");
                break;
            }
        }
        scanner.close();
    }
}
