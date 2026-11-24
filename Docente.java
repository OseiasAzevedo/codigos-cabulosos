//OSEIAS AZEVEDO
public class Docente extends Pessoa{
    private String disciplina;

    public Docente(String disciplina, String cpf, int idade, String nome) {
        super(cpf, idade, nome);
        this.disciplina = disciplina;
    }

    @Override 
    public void exibirDados() {
        System.out.println("<-- PROFESSOR:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Disciplina: " + disciplina);
        System.out.println("<===--- = -- = ---===>");

    }

    public String getDisciplina() {
        return disciplina;
    }

    

    


}
