package interface_lambda.exercicio1mensagem;

public class RedesSociais implements ServicoMensagem {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem pelas redes sociais... \n" + mensagem);
    }
}
