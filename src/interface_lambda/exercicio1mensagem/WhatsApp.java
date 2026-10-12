package interface_lambda.exercicio1mensagem;

public class WhatsApp implements ServicoMensagem {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem no WhatsApp... \n" + mensagem);
    }
}
