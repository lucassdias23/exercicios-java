package heranca_polimorfismo.exercicio2_funcionarios;

public class Atendente extends Usuario {

    private double valorCaixa;

    public Atendente() {

        this.setIsAdmin(false);
        this.valorCaixa = 0.0;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public void recebePagamentos(double valor) {
        this.valorCaixa += valor;
        System.out.println("\n==========================================");
        System.out.println("       PAGAMENTO RECEBIDO COM SUCESSO!   ");
        System.out.println("==========================================");
        System.out.printf(" Valor Recebido:  R$ %,.2f\n", valor);
        System.out.printf(" Saldo em Caixa:  R$ %,.2f\n", this.valorCaixa);
        System.out.println(" Status:          Transação Concluída!");
        System.out.println("==========================================\n");
    }

    public void fecharCaixa(){
        System.out.println("\n==========================================");
        System.out.println("             FECHAMENTO DE CAIXA          ");
        System.out.println("==========================================");
        System.out.printf(" Total Arrecadado: R$ %,.2f\n", this.valorCaixa);
        System.out.println(" Status:            Caixa fechado com sucesso! ");
        System.out.println("==========================================\n");
    }

}
