package desafio_de_codigo_no_setor_bancario;

// Criar um programa que leia dois textos: o código informado pelo operador e o código esperado pelo sistema. Se os dois textos forem exatamente iguais, o programa deve indicar que a validação foi aprovada. Caso contrário, deve informar que houve erro de digitação. A comparação deve considerar todos os caracteres exatamente como foram recebidos, incluindo letras maiusculas, minusculas, numeros e simbolos. Não há necessidade de tratar espaços extras fora do que for lido como entrada. O problema possui um unico objetivo: decidir se os dois codigos sao identicos ou não.

import java.util.Scanner;

public class ValidaCodigoBancario {

    private static final String WELCOME_MESSAGE = "Validação de Código Bancário";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);

        System.out.println("Informe o primeiro código: ");
        String codigoInformado = scanner.nextLine();

        System.out.println("Informe o segundo código: ");
        String codigoEsperado = scanner.nextLine();


        System.out.println((codigoInformado.equals(codigoEsperado)) ? "ACESSO LIBERADO" : "ACESSO NEGADO");
    }
}