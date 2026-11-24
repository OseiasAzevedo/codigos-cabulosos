public class Professor extends Pessoa{
    private String titulacao;
    private String area;

    public Professor(String area, String titulacao, int idade, String nome) {
        super(idade, nome);
        this.area = area;
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override 
    public void exibirDados(){
        System.out.println("<==-- --=-- --==>");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Titulo: " + titulacao);
        System.out.println("Area: " + area);
        System.out.println("<==-- --=-- --==>");
    }


}
