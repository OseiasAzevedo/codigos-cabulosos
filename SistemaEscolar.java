//OSEIAS AZEVEDO
import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        Pessoa[] pessoas = new Pessoa[5];
        int contador = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("1 -> Cadastrar Professor");
            System.out.println("2 -> Cadastrar Aluno");
            System.out.println("3 -> Listar todos");
            System.out.println("4 -> Sair");   
            int opcao = lerInteiro(scanner, "Opcão: ");

            switch (opcao) {
                case 1:
                    if (contador >= pessoas.length) {
                        System.out.println("Limite maximo atingido");
                        break;
                    }
                    System.out.println("\n <= ----- CADASTRO DE PROFESSOR ----- =>");
                    String nomeP = lerTexto(scanner, "Nome: ");
                    String cpfP = lerTexto(scanner, "CPF: ");
                    int idadeP = lerIdade(scanner, "Idade: ");
                    String disciplina = lerTexto(scanner, "Disciplina: ");

                    pessoas[contador] = new Docente(disciplina, cpfP, idadeP, nomeP);
                    contador++;
                    System.out.println("Professor cadastrado com suceso");
                    break;
                case 2:
                    if (contador >= pessoas.length) {
                        System.out.println("Limite maximo atingido");
                        break;
                    }
                    System.out.println("\n <= ----- CADASTRO DE PROFESSOR ----- =>");
                    String nomeA = lerTexto(scanner, "Nome: ");
                    String cpfA = lerTexto(scanner, "CPF: ");
                    int idadeA = lerIdade(scanner, "Idade: ");
                    String turma = lerTexto(scanner, "Disciplina: ");

                    pessoas[contador] = new Aluno(cpfA, idadeA, nomeA, turma);
                    contador++;
                    System.out.println("Professor cadastrado com suceso");
                    break;
                case 3:
                    System.out.println("\n ==== LISTA DE PESSOAS ====");
                    if (contador == 0) {
                        System.out.println("nenhuma pessoa cadastrada");
                    } else{
                        for (int i = 0; i< contador; i++) {
                            pessoas[i].exibirDados();
                        }
                    }
                    break;
                case 4:
                    continuar = false;
                    System.out.println("encerrado");
                    break;
                default:
                    System.out.println("opcao invalida, digite um numero de 1 a 4");
                    break;
            }
        }

        scanner.close();
    }
    private static String lerTexto(Scanner scanner,String rotulo){
        while (true) {
            System.out.println(rotulo);
            String texto = scanner.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.println("ERRO: este campo nao pode ficar vazio");
        }

    }
    private static int lerInteiro(Scanner scanner,String rotulo){
        while (true) {
            System.out.print(rotulo);
            String entrada = scanner.nextLine().trim();
            try {
                return Integer.parseInt(entrada);

            } catch (NumberFormatException e) {
                System.out.println("digite apenas numeros inteiros");
                // TODO: handle exception
            }        
        }

    }
    private static int lerIdade(Scanner scanner,String rotulo){
        while (true) {
            int idade = lerInteiro(scanner, rotulo);
            if (idade > 0) {
                return idade;
            }
            System.out.println("ERRO: este campo nao pode ficar vazio");
        }

    }
}

