package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalDate;

public class TestaLivros {
    public static void main(String[] args) {
        Livro primeiroLivro = new Livro();
        primeiroLivro.titulo = "Java Orientado a Objetos";
        primeiroLivro.autor = "Thiago Leite";
        primeiroLivro.preco = 59.90;
        primeiroLivro.paginas = 300;
        primeiroLivro.editora = "Casa do Código";
        primeiroLivro.isbn = "978-85-66250-46-6";


        primeiroLivro.dataLancamento = LocalDate.now().minusDays(10);

        System.out.println("Dados do Primeiro Livro:");
        primeiroLivro.exibir();

        Livro segundoLivro = new Livro();
        segundoLivro.titulo = "Spring Boot Pro";
        segundoLivro.autor = "Nélio Alves";
        segundoLivro.preco = 89.90;
        segundoLivro.dataLancamento = LocalDate.now().plusDays(15);

        System.out.println("Dados do Segundo Livro:");
        segundoLivro.exibir();
    }
}