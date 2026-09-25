package heranca_polimorfismo.exercicio1_ingresso;

import java.util.Scanner;

public class Main {

    private static final String WELCOME_MESSAGE = "Bem vindo ao Cinema!\n";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);

        int opcaoFilme;
        String tituloFilme = "";

        do {

            System.out.println("Escolha um filme: \n");
            System.out.println("1. Homem Aranha: Um Novo Dia");
            System.out.println("2. Vingadores - Ultimato");
            System.out.println("3. Resident Evil");
            System.out.println("4. De Pernas Pro Ar");
            System.out.println("5. A Ilha Esquecida");
            System.out.println("6. Antártida\n");
            opcaoFilme = scanner.nextInt();

            tituloFilme = switch (opcaoFilme) {

                case 1 -> "Homem Aranha: Um Novo Dia";
                case 2 -> "Vingadores - Ultimato";
                case 3 -> "Resident Evil";
                case 4 -> "De Pernas Pro Ar";
                case 5 -> "A Ilha Esquecida";
                case 6 -> "Antártida";
                default -> "Opção inválida! Selecione um filme.";
            };

            if (opcaoFilme >= 1 && opcaoFilme <= 6) {
                System.out.println("\nFilme selecionado: " + tituloFilme);
            } else {
                System.out.println(tituloFilme);
            }
        }
        while (opcaoFilme < 1 || opcaoFilme > 6);

        System.out.println("\nEscolha o idioma: ");
        System.out.println("1. Dublado");
        System.out.println("2. Legendado\n");
        int opcaoIdioma = scanner.nextInt();

        boolean eDublado = (opcaoIdioma == 1);

        System.out.println("\nEscolha o tipo de ingresso:");
        System.out.println("1. Inteira");
        System.out.println("2. Meia-Entrada");
        System.out.println("3. Família\n");
        int tipoIngresso = scanner.nextInt();

        if (tipoIngresso == 1){
            Ingresso ingresso = new Ingresso();

            ingresso.setTitulo(tituloFilme);
            ingresso.setDublado(eDublado);
            ingresso.setValor(40.0);

            System.out.println("\n=== RESUMO DO INGRESSO ===");
            System.out.println("Filme: " + ingresso.getTitulo());
            System.out.println("Idioma: " + (ingresso.isDublado() ? "Dublado" : "Legendado"));
            System.out.println("Tipo: Inteira");
            System.out.printf("Valor final: R$ %.2f%n", ingresso.getValorReal());

        }

        else if (tipoIngresso == 2) {
            MeiaEntrada meia = new MeiaEntrada();

            meia.setTitulo(tituloFilme);
            meia.setDublado(eDublado);
            meia.setValor(40.0);

            System.out.println("\n=== RESUMO DO INGRESSO ===");
            System.out.println("Filme: " + meia.getTitulo());
            System.out.println("Idioma: " + (meia.isDublado() ? "Dublado" : "Legendado"));
            System.out.println("Tipo: Meia-Entrada");
            System.out.printf("Valor final: R$ %.2f%n", meia.getValorReal());
        }

        else if (tipoIngresso == 3) {
            IngressoFamilia ingressoFamilia = new IngressoFamilia();

            System.out.println("Quantas pessoas irão assistir ao filme?");
            int numPessoas = scanner.nextInt();
            ingressoFamilia.setNumeroPessoas(numPessoas);

            ingressoFamilia.setTitulo(tituloFilme);
            ingressoFamilia.setDublado(eDublado);
            ingressoFamilia.setValor(40.0);

            System.out.println("\n=== RESUMO DO INGRESSO ===");
            System.out.println("Filme: " + ingressoFamilia.getTitulo());
            System.out.println("Idioma: " + (ingressoFamilia.isDublado() ? "Dublado" : "Legendado"));
            System.out.println("Tipo: Família");
            System.out.printf("Valor: R$ %.2f%n", ingressoFamilia.getValorReal());

        }
    }
}
