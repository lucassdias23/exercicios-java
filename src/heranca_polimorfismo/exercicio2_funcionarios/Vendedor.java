package heranca_polimorfismo.exercicio2_funcionarios;

public class Vendedor extends Usuario {

    private int qtdVendas;

    public Vendedor() {
        this.setIsAdmin(false);
        this.qtdVendas = 0;
    }

    public void consultarVendas() {
        System.out.println("\n==========================================");
        System.out.println("         PAINEL DE VENDAS - VENDEDOR      ");
        System.out.println("==========================================");
        System.out.println(" Quantidade de Vendas Realizadas: " + this.qtdVendas);
        System.out.println(" Desempenho: " + (this.qtdVendas >= 10 ? "Excelente! Meta atingida " : "Em andamento... "));
        System.out.println("==========================================\n");
    }

    public void realizarVenda() {
        this.qtdVendas++;
        System.out.println("\n==========================================");
        System.out.println("       VENDA REGISTADA COM SUCESSO!      ");
        System.out.println("==========================================");
        System.out.println(" Total de vendas realizadas hoje: " + this.qtdVendas);
        System.out.println(" Status: Venda contabilizada no sistema!");
        System.out.println("==========================================\n");
    }

    public int getQtdVendas() {
        return this.qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }


}