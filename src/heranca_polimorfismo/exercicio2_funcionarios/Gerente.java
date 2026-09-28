package heranca_polimorfismo.exercicio2_funcionarios;

public class Gerente extends Usuario {

    public Gerente() {
        this.setIsAdmin(true);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("\n==========================================");
        System.out.println("       RELATÓRIO FINANCEIRO - LOJA        ");
        System.out.println("==========================================");
        System.out.println(" Faturamento Bruto:    R$ 150.450,00");
        System.out.println(" Despesas Operacionais: R$  42.100,00");
        System.out.println(" Comissões de Vendas:  R$  12.350,00");
        System.out.println("------------------------------------------");
        System.out.println(" Lucro Líquido:        R$  95.990,00");
        System.out.println(" Status:               DENTRO DA META");
        System.out.println("==========================================\n");
    }

    public void consultarVendas() {
        System.out.println("\n==========================================");
        System.out.println("           CONSULTA DE VENDAS             ");
        System.out.println("==========================================");
        System.out.println(" Total de vendas no mês: 342 pedidos");
        System.out.println(" Ticket Médio: R$ 439,91");
        System.out.println(" Vendedor Destaque: Vendedor 01");
        System.out.println("==========================================\n");;
    }

}
