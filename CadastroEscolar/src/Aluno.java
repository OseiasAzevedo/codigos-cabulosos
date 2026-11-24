
//OSEIAS AZEVEDO

public class Aluno extends Pessoa{
    private String turma;

    public Aluno(String cpf, int idade, String nome, String turma) {
        super(cpf, idade, nome);
        this.turma = turma;
    }

    @Override 
    public void exibirDados() {
        System.out.println("<-- PROFESSOR:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Disciplina: " + turma);
        System.out.println("<===--- = -- = ---===>");
    }

    public String getTurma() {
        return turma;
    }

}
