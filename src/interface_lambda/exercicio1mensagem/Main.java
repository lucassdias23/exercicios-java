package interface_lambda.exercicio1mensagem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "=== BEM VINDO(A) AO SERVIÇO DE MENSAGENS ===\n";

    public static void main(String[] args) {

        System.out.println(WELCOME_MESSAGE);

        var scanner = new Scanner(System.in);

        Map<Integer, ServicoMensagem> servicosMap = new HashMap<>();

        servicosMap.put(1, new SmsService()::enviar);
        servicosMap.put(2, new Email()::enviar);
        servicosMap.put(3, new RedesSociais()::enviar);
        servicosMap.put(4, new WhatsApp()::enviar);

        while(true){
            System.out.println("\nEscolha uma opção:\n");
            System.out.println("1. Enviar promoção por SMS");
            System.out.println("2. Enviar promoção por Email");
            System.out.println("3. Enviar promoção por Redes Sociais");
            System.out.println("4. Enviar promoção por WhatsApp");
            System.out.println("5. Sair\n");

            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Saindo do sistema... Até logo!");
                scanner.close();
                break;
            }

            ServicoMensagem servicoMensagem = servicosMap.get(option);

            if(servicoMensagem != null){
                servicoMensagem.enviar("A mensagem promocional foi enviada com sucesso!\n");
            } else {
                System.out.println("Opção inválida! Selecione uma opção válida do menu, e tente novamente.\n");
                continue;
            }

        }

    }

}
