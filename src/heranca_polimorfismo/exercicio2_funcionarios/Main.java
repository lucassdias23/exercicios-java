package heranca_polimorfismo.exercicio2_funcionarios;

import java.util.Scanner;

public class Main {

    private static final String WELCOME_MESSAGE = "=== SISTEMA DE GESTÃO DE FUNCIONÁRIOS ===";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);

        int credencial;

        do {
            System.out.println("\nSeja bem-vindo! Selecione o seu perfil de credencial:\n");
            System.out.println("1. Gerente");
            System.out.println("2. Vendedor");
            System.out.println("3. Atendente");
            System.out.println("4. Sair");
            System.out.print("\nOpção: ");
            credencial = scanner.nextInt();

            if (credencial >= 1 && credencial <= 3) {
                scanner.nextLine();

                Usuario usuarioLogado = switch (credencial) {
                    case 1 -> new Gerente();
                    case 2 -> new Vendedor();
                    case 3 -> new Atendente();
                    default -> null;
                };

                System.out.print("\nDigite a sua credencial: ");
                usuarioLogado.setNome(scanner.nextLine());
                usuarioLogado.realizarLogin();

                System.out.print("\nDigite a sua senha: ");
                usuarioLogado.setSenha(scanner.nextLine());
                usuarioLogado.loginAutenticado();

                int acao;
                do {
                    exibirMenuPorPerfil(credencial);
                    acao = scanner.nextInt();

                    processarAcao(credencial, acao, usuarioLogado, scanner);

                } while (acao != 5);
            }

        } while (credencial != 4);

        System.out.println("\nSistema encerrado com sucesso. Até logo!");
    }

    private static void exibirMenuPorPerfil(int perfil) {
        String titulo = switch (perfil) {
            case 1 -> "GERENTE";
            case 2 -> "VENDEDOR";
            case 3 -> "ATENDENTE";
            default -> "";
        };

        System.out.println("\n--- PAINEL DO " + titulo + " ---");
        System.out.println("\nO que você deseja fazer?");

        if (perfil == 1) {
            System.out.println("1. Gerar relatório financeiro");
            System.out.println("2. Consultar vendas");
        } else if (perfil == 2) {
            System.out.println("1. Realizar venda");
            System.out.println("2. Consultar vendas");
        } else if (perfil == 3) {
            System.out.println("1. Receber pagamentos");
            System.out.println("2. Fechar caixa");
        }

        System.out.println("3. Alterar dados");
        System.out.println("4. Alterar senha");
        System.out.println("5. Realizar Logoff");
        System.out.print("\nEscolha uma opção: ");
    }

    private static void processarAcao(int perfil, int acao, Usuario usuario, Scanner scanner) {
        switch (acao) {
            case 1 -> {
                if (usuario instanceof Gerente gerente) gerente.gerarRelatorioFinanceiro();
                else if (usuario instanceof Vendedor vendedor) vendedor.realizarVenda();
                else if (usuario instanceof Atendente atendente) {
                    System.out.print("\nInforme o valor a receber: R$ ");
                    double valor = scanner.nextDouble();
                    atendente.recebePagamentos(valor);
                }
            }
            case 2 -> {
                if (usuario instanceof Gerente gerente) gerente.consultarVendas();
                else if (usuario instanceof Vendedor vendedor) vendedor.consultarVendas();
                else if (usuario instanceof Atendente atendente) atendente.fecharCaixa();
            }
            case 3 -> {
                scanner.nextLine();
                System.out.print("Informe o novo nome: ");
                String novoNome = scanner.nextLine();
                System.out.print("Informe o novo e-mail: ");
                String novoEmail = scanner.nextLine();
                usuario.alterarDados(novoNome, novoEmail);
            }
            case 4 -> {
                scanner.nextLine();
                System.out.print("Informe a nova senha: ");
                String novaSenha = scanner.nextLine();
                usuario.alterarSenha(novaSenha);
            }
            case 5 -> {
                scanner.nextLine();
                usuario.realizarLogoff();
            }
            default -> System.out.println("Opção inválida! Tente novamente.");
        }
    }
}