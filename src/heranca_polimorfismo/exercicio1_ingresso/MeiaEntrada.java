package heranca_polimorfismo.exercicio1_ingresso;

public class MeiaEntrada extends Ingresso {

    @Override
    public double getValorReal() {
        return this.valor / 2.0;
    }
}
