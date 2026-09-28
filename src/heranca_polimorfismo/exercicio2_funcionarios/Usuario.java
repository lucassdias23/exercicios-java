package heranca_polimorfismo.exercicio2_funcionarios;

public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private boolean isAdmin;

    public String getNome() { return this.nome; }
    public String getEmail() {
        return this.email;
    }
    public String getSenha() {
        return this.senha;
    }
    public boolean isAdmin() {
        return this.isAdmin;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void realizarLogin() {
        System.out.println("Usuário: " + this.nome + " identificado!");
    }

    public void loginAutenticado() {
        System.out.println("Usuário: " + this.nome + " autenticado com sucesso!");
    }

    public void realizarLogoff() {
        System.out.println("Usuário: " + this.nome + " deslogou do sistema.");
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso!");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("\nDados alterados com sucesso!");
    }
}
