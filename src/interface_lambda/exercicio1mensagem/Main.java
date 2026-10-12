package interface_lambda.exercicio1mensagem;

import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "=== BEM VINDO(A) AO SERVIÇO DE MENSAGENS ===\n";

    public static void main(String[] args) {

        System.out.println(WELCOME_MESSAGE);
        System.out.println("Escolha uma opção:\n");

        var scanner = new Scanner(System.in);

        int option;

        ServicoMensagem enviarMensagem;

        while(true){
            System.out.println("1. Enviar promoção por SMS");
            System.out.println("2. Enviar promoção por Email");
            System.out.println("3. Enviar promoção por Redes Sociais");
            System.out.println("4. Enviar promoção por WhatsApp");
            System.out.println("5. Sair\n");
            option = scanner.nextInt();

            if (option == 1){
                enviarMensagem = enviarSMS();
            } else if (option == 2){
                enviarMensagem = enviarEmail();
            } else if (option == 3){
                enviarMensagem = enviarRedesSociais();
            } else if (option == 4) {
                enviarMensagem = enviarWhatsApp();
            } else if (option == 5){
                System.out.println("Saindo do sistema... Até logo!");
                scanner.close();
                break;
            } else {
                System.out.println("Opção inválida! Selecione uma opção válida do menu, e tente novamente.\n");
                continue;
            }

            enviarMensagem.enviar("A mensagem foi enviada!\n");

        }

    }

    private static ServicoMensagem enviarSMS(){
        return new SmsService();
    }

    private static ServicoMensagem enviarEmail(){
        return new Email();
    }

    private static ServicoMensagem enviarRedesSociais(){
        return new RedesSociais();
    }

    private static ServicoMensagem enviarWhatsApp(){
        return new WhatsApp();
    }

}
