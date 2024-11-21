import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inicializarLivros();
    }

            private static List<Livro> livros = new ArrayList<>();
            private static List<Pessoa> leitores = new ArrayList<>();
            private static List<Emprestimo> emprestimos = new ArrayList<>();


                Scanner scanner = new Scanner(System.in);
                int opcao;

                do {
                    System.out.println("\n=== Sistema de Biblioteca ===");
                    System.out.println("1. Cadastrar Leitor");
                    System.out.println("2. Consultar Livros");
                    System.out.println("3. Realizar Empréstimo");
                    System.out.println("4. Consultar Empréstimos");
                    System.out.println("5. Listar Leitores");
                    System.out.println("0. Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1 -> cadastrarLeitor(scanner);
                        case 2 -> consultarLivros();
                        case 3 -> realizarEmprestimo(scanner);
                        case 4 -> consultarEmprestimos();
                        case 5 -> listarLeitores();
                        case 0 -> System.out.println("Saindo...");
                        default -> System.out.println("Opção inválida.");
                    }
                } while (opcao != 0);

                scanner.close();}
    }
             }