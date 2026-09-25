package heranca_polimorfismo.exercicio1_ingresso;

public class Ingresso {

    protected double valor;
    protected String titulo;
    protected boolean dublado;

    public double getValorReal() {
        return this.valor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean isDublado() {
        return this.dublado;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDublado(boolean dublado) { this.dublado = dublado; }
}