public class AlunoBolsista extends Aluno{
    private double valorBolsa;

    public AlunoBolsista(double valorBolsa, String curso, String matricula, int idade, String nome) {
        super(curso, matricula, idade, nome);
        this.valorBolsa = valorBolsa;
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Override 
    public void exibirDados(){
        System.out.println("<==-- --=-- --==>");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Valor da Bolsa: " + valorBolsa);
        System.out.println("<==-- --=-- --==>");

    }
}
