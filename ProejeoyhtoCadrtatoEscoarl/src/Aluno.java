public class Aluno extends Pessoa {
    protected  String matricula;
    protected  String curso;

    public Aluno(String curso, String matricula, int idade, String nome) {
        super(idade, nome);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override 
    public void exibirDados(){
        System.out.println("<==-- --=-- --==>");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("<==-- --=-- --==>");
    }

}
