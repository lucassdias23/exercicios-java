package programacao_poo.exercicio1_conta_bancaria;


public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;
    private double chequeEspecialUsado;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            this.chequeEspecial = 50.00;
        }

        else {
            this.chequeEspecial = depositoInicial * 0.5;
        }

    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public double getChequeEspecialUsado() {
        return this.chequeEspecialUsado;
    }

    public void depositar(double valor) {

        if (this.chequeEspecialUsado == 0) {
            this.saldo += valor;
        }

        else {
            double dividaTotal = this.chequeEspecialUsado * 1.20;

            if (valor >= dividaTotal) {
                this.saldo += (valor - dividaTotal);
                this.chequeEspecialUsado = 0;
            }
            else {
                double dividaRestanteComJuros = dividaTotal - valor;
                this.chequeEspecialUsado = dividaRestanteComJuros / 1.20;
            }

        }

    }

    public boolean sacar(double valor) {
        double limiteDisponivel = this.chequeEspecial - this.chequeEspecialUsado;

        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else if (valor <= this.saldo + limiteDisponivel) {
            double restante = valor - this.saldo;
            this.saldo = 0;
            this.chequeEspecialUsado += restante;
            return true;
        } else {
            return false;
        }
    }

    public boolean pagarBoleto(double valor) {
        return this.sacar(valor);
    }

}

