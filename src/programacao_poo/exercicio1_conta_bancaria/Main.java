package programacao_poo.exercicio1_conta_bancaria;

import java.io.Console;
import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Olá, seja bem vindo(a)!\n";

    private final static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);

        var option = -1;

        System.out.println("Para começar, informe o valor do depósito inicial: ");
        double depositoInicial = scanner.nextDouble();

        System.out.println("\nAgora selecione a opção desejada: ");

        ContaBancaria conta = new ContaBancaria(depositoInicial);

        do {
            System.out.println("\n1. Consultar saldo.");
            System.out.println("2. Consultar cheque especial.");
            System.out.println("3. Depositar dinheiro.");
            System.out.println("4. Sacar dinheiro.");
            System.out.println("5. Pagar um boleto.");
            System.out.println("6. Verificar uso do cheque especial");
            System.out.println("7. Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> System.out.printf("\nSaldo atual: R$ %.2f\n", conta.getSaldo());

                case 2 -> System.out.printf("\nCheque especial disponível: R$ %.2f\n", conta.getChequeEspecial());

                case 3 -> {
                    System.out.println("\nInforme o valor do depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("\nDepósito realizado com sucesso!");
                }

                case 4 -> {
                    System.out.print("\nInforme o valor do saque: R$ ");
                    double valorSaque = scanner.nextDouble();

                    if (conta.sacar(valorSaque)) {
                        System.out.println("\nSaque realizado com sucesso!");
                    } else {
                        System.out.println("\nSaldo e limite da conta insuficientes para concluir o saque! Tente novamente.");
                    }
                }

                case 5 -> {
                    System.out.print("\nInforme o valor do pagamento: R$ ");
                    double valorPagamento = scanner.nextDouble();

                    if (conta.pagarBoleto(valorPagamento)) {
                        System.out.println("\nPagamento realizado com sucesso!");
                    } else {
                        System.out.println("\nSaldo e limite da conta insuficientes para concluir o pagamento! Tente novamente.");
                    }
}
                case 6 -> {
                    if (conta.getChequeEspecialUsado() > 0) {
                        System.out.printf("\nVocê está usando o cheque especial! Valor utilizado: R$ %.2f\n", conta.getChequeEspecialUsado());
                    } else {
                        System.out.println("\nVocê não está usando o cheque especial no momento.");
                    }
                }

                case 7 -> {
                    System.out.println("\nObrigado por utilizar os nossos serviços. Até logo!");
                    scanner.close();
                }

                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
            while (option != 7);
    }

}


