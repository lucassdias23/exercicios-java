package programacao_poo.exercicio2_controle_carro;

import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Escolha uma opção para iniciar.\n";

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(WELCOME_MESSAGE);

        var option = -1;

        Carro meuCarro = new Carro();

        do {
            System.out.println("1. Ligar o carro ");
            System.out.println("2. Acelerar ");
            System.out.println("3. Reduzir velocidade ");
            System.out.println("4. Virar para esquerda ");
            System.out.println("5. Virar para direita ");
            System.out.println("6. Verificar velocidade ");
            System.out.println("7. Trocar marcha ");
            System.out.println("8. Desligar o carro ");
            option = scanner.nextInt();

        switch (option) {
            case 1 -> meuCarro.ligar();
            case 2 -> meuCarro.acelerar();
            case 3 -> meuCarro.desacelerar();
            case 4 -> meuCarro.virarEsquerda();
            case 5 -> meuCarro.virarDireita();
            case 6 -> meuCarro.getVelocidade();
            case 7 -> {
                System.out.println("Digite a marcha desejada (0 a 6): ");
                int novaMarcha = scanner.nextInt();
                meuCarro.trocarMarcha(novaMarcha);
            }
            case 8 -> meuCarro.desligar();

            default -> System.out.println("Opção inválida. Tente novamente.");

            }
        }

        while (option != 8);

    }
}