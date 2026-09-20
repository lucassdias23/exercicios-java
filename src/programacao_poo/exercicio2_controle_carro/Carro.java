package programacao_poo.exercicio2_controle_carro;

public class Carro {

    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar() {
        if (this.ligado) {
            System.out.println("O carro já está ligado!");
            return;
        }
        this.ligado = true;
        System.out.println("O carro foi ligado!");
    }

    public void desligar() {

        if (!this.ligado) {
            System.out.println("O carro já se encontra desligado!");
            return;
        }

        if (this.velocidade != 0 || this.marcha != 0) {
            System.out.println("O carro não pode ser desligado. A velocidade precisa estar em 0 e em ponto morto!");
            return;
        }

        this.ligado = false;
        System.out.println("O carro foi desligado!");

    }

    public void acelerar() {
        if (!this.ligado) {
            System.out.println("O carro está desligado. Você precisa ligá-lo primeiro!");
            return;
        }

        if (this.marcha == 0) {
            System.out.println("O carro está em ponto morto. Você precisa selecionar uma marcha!");
            return;
        }

        int limiteMaximo = this.marcha * 20;

        if (this.velocidade >= limiteMaximo) {
            System.out.println("Limite atingido para a marcha atual! Troque a marcha.");
            return;
        }

        this.velocidade++;
        System.out.println("Velocidade aumentada para: " + this.velocidade + " km/h");
    }

    public void desacelerar() {
        if (!this.ligado) {
            System.out.println("O carro está desligado. Não é possível reduzir a velocidade!");
            return;
        }

        if (this.velocidade == 0) {
            System.out.println("O carro já está parado!");
            return;
        }

        this.velocidade--;
        System.out.println("Velocidade reduzida para: " + this.velocidade + " km/h");
    }

    public void trocarMarcha(int novaMarcha) {

        if (!this.ligado) {
            System.out.println("Erro na troca de marcha! Para a troca ser efetuada, o carro precisa estar ligado.");
            return;
        }

        if  (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida! As marchas devem ser entre 0 e 6.");
            return;
        }

        if (novaMarcha != this.marcha + 1 && novaMarcha != this.marcha -1) {
            System.out.println("Erro: não é permitido pular marchas!");
            return;
        }

       if (this.velocidade > novaMarcha * 20) {
           System.out.println("Velocidade incompatível para engatar a " + novaMarcha + "ª marcha!");
           return;
       }

        this.marcha = novaMarcha;
        System.out.println("Marcha alterada com sucesso! Velocidade atual: " + this.velocidade + " km/h");
    }

    public void virarDireita() {
        if (!this.ligado) {
            System.out.println("Erro: para alterar a direção, o carro precisa estar ligado!");
            return;
        }

        if (this.velocidade == 0 || this.velocidade > 40) {
            System.out.println("Erro: a curva não pode ser feita, está fora da velocidade permitida!");
            return;
        }
        System.out.println("Sucesso! O carro virou à direita.");
    }

    public void virarEsquerda() {

        if (!this.ligado) {
            System.out.println("Erro: para alterar a direção, o carro precisa estar ligado!");
            return;
        }

        if (this.velocidade == 0 || this.velocidade > 40) {
            System.out.println("Erro: a curva não pode ser feita, está fora da velocidade permitida!");
            return;
        }
        System.out.println("Sucesso! O carro virou à esquerda.");

    }

    public int getVelocidade() {

        if (!this.ligado) {
            System.out.println("Erro ao verificar a velocidade. O carro precisa estar ligado!");
        } else {

            System.out.println("Velocidade atual: " + this.velocidade + " km/h");
        }
        return this.velocidade;

    }
}