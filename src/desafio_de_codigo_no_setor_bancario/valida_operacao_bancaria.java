package desafio_de_codigo_no_setor_bancario;

// Criar um programa que leia uma única palavra e verifique se ela é exatamente igual a DEPOSITO, SAQUE ou TRANSFERENCIA. Se for igual a uma dessas opções, a operação deve ser considerada válida. Caso contrario, ela deve ser considerada inválida. A comparacao deve respeitar exatamente os caracteres informados, incluindo letras maiúsculas e minúsculas. Assim, deposito e DEPOSITO devem ser tratados como valores diferentes.

import java.util.Scanner;

public class valida_operacao_bancaria {

    private static final String WELCOME_MESSAGE = "Validação de Operação Bancária";

    static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);


        System.out.println("Informe a operação desejada: ");
        String operacao = scanner.nextLine();

        boolean operacaoValida = false;

        if (operacao.equals("DEPOSITO") || operacao.equals("SAQUE") || operacao.equals("TRANSFERENCIA")) {
            operacaoValida = true;
        }

        System.out.println(operacaoValida ? "VALID" : "INVALID");

        scanner.close();
    }
}
