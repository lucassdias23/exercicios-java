package heranca_polimorfismo.exercicio1_ingresso;

public class IngressoFamilia extends Ingresso {

    private static final double DESCONTO_FAMILIA = 0.05;

    private int numeroPessoas;

    @Override
    public double getValorReal() {
        double valorTotal = this.valor * this.numeroPessoas;

        if (this.numeroPessoas > 3) {
            return valorTotal * (1 - DESCONTO_FAMILIA);
        }

        return valorTotal;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }
}
