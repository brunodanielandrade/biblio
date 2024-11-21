import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Emprestimo {

        private Livro livro;
        private Pessoa leitor;
        private LocalDate dataEmprestimo;

        public Emprestimo(Livro livro, Pessoa leitor) {
            this.livro = livro;
            this.leitor = leitor;
            this.dataEmprestimo = LocalDate.now();
        }

        public Livro getLivro() {
            return livro;
        }

        public Pessoa getLeitor() {
            return leitor;
        }

        public LocalDate getDataEmprestimo() {
            return dataEmprestimo;
        }

        public LocalDate getDataDevolucao() {
            return dataEmprestimo.plusDays(14);
        }
    }
