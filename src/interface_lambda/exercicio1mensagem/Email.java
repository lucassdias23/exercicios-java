package interface_lambda.exercicio1mensagem;

public class Email implements ServicoMensagem {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem por Email... \n" + mensagem);
    }

}
