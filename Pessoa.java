//OSEIAS AZEVEDO
public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;

    public Pessoa(String cpf, int idade, String nome) {
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }

    public abstract void exibirDados();
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

}
