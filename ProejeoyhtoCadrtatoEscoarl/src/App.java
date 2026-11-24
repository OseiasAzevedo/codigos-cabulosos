import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[2];
        int contador = 0;
        int opcao;

        do {
            System.out.println("\n<==---- -> =-MENU-= <-  ----==>");
            System.out.println("1 -> Cadastrar Aluno");
            System.out.println("2 -> Cadastrar Professor");
            System.out.println("3 -> Cadastrar Aluno Bolsista");
            System.out.println("4 -> Listar Aluno");
            System.out.println("5 -> Listar Professor");
            System.out.println("6 -> Listar Aluno Bolsista");
            System.out.println("0 -> Sair");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();

            scan.nextLine();
            switch (opcao) {
                case 1:
                    if (contador >= pessoas.length) {
                        System.out.println("Limite atingido");
                        break;
                    }
                    String nomeA = lerTexto(scan, "Nome: ");
                    int idadeA = lerIdade(scan, "idade: ");
                    String matriculaA = lerTexto(scan, "Matricula: ");
                    String cursoA = lerTexto(scan, "Curso: ");

                    pessoas[contador] = new Aluno(cursoA, matriculaA, idadeA, nomeA);
                    contador++;

                    break;
                case 2:
                    if (contador >= pessoas.length) {
                        System.out.println("Limite atingido");
                        break;
                    }
                    String nomeP = lerTexto(scan, "Nome: ");
                    int idadeP = lerIdade(scan, "idade: ");
                    String titulacaoP = lerTexto(scan, "Matricula: ");
                    String areaP = lerTexto(scan, "Curso: ");

                    pessoas[contador] = new Professor(titulacaoP, areaP, idadeP, nomeP);
                    contador++;
                    break;
                case 3:
                    if (contador >= pessoas.length) {
                        System.out.println("Limite atingido");
                        break;
                    }
                    String nomeAB = lerTexto(scan, "Nome: ");
                    int idadeAB = lerIdade(scan, "idade: ");
                    String matriculaAB = lerTexto(scan, "Matricula: ");
                    String cursoAB = lerTexto(scan, "Curso: ");
                    double valorBolsaAB = lerDouble(scan, "Valor da Bolsa: ");

                    pessoas[contador] = new AlunoBolsista(valorBolsaAB, cursoAB, matriculaAB, idadeAB, nomeAB);
                    contador++;
                    break;
                case 4:
   
                    boolean encontrouAluno = false;

                    for (int i = 0; i < contador; i++) {
                        if (pessoas[i] instanceof AlunoBolsista) {
                            continue;
                        }

                        if (pessoas[i] instanceof Aluno) {
                            pessoas[i].exibirDados();
                            encontrouAluno = true;
                        }
                    }

                    if (!encontrouAluno) {
                        System.out.println("Nenhum aluno cadastrado");
                    }
                    break;
                case 5:
                    boolean encontrouP = false;
                    
                    for (int i = 0; i < contador; i++) {
                        if (pessoas[i] instanceof Professor) {
                            pessoas[i].exibirDados();
                            encontrouP = true;
                        }
                    }
                    if (!encontrouP) {
                        System.out.println("Nenhum professor cadastrado");
                    }

                    break;
                case 6:
                    boolean encontrouAB = false;
                    
                    for (int i = 0; i < contador; i++) {
                        if (pessoas[i] instanceof Professor) {
                            pessoas[i].exibirDados();
                            encontrouAB = true;
                        }
                    }
                    if (!encontrouAB) {
                        System.out.println("Nenhum aluno bolsista cadastrado");
                    }
                    break;
                case 0:
                    System.out.println("saiu");
                    break;

                default:
                    break;
            }
        } while (opcao != 0);


    }

     private static String lerTexto(Scanner scan, String rotulo) {
        while (true) {
            System.out.print(rotulo);
            String texto = scan.nextLine();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.println("Nao pode ta vazio");
        }
    }

    private static int lerInteiro(Scanner scan, String rotulo) {
        while (true) {
            System.out.print(rotulo);
            String entrada = scan.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("apenas numeros");
            }
        }
    }

    private static double lerDouble(Scanner scan, String rotulo) {
        while (true) {
            System.out.print(rotulo);
            String entrada = scan.nextLine().trim();
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("apenas numeros");
            }
        }
    }

    private static int lerIdade(Scanner scan, String rotulo) {
        while (true) {
            int idade = lerInteiro(scan, rotulo);
            if (idade > 0) {
                return idade;
            }
            System.out.println("maior que zero");
        }
    }

}
