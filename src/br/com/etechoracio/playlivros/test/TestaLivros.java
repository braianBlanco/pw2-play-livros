package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.Enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Livro;
import java.time.LocalTime;

public class TestaLivros {
    public static void main(String[] args) {
        Livro primeiroLivro = new Livro();
        primeiroLivro.titulo = "O Poder do Hábito";
        primeiroLivro.autor = "Charles Du higg";
        primeiroLivro.narrador = "Carlos Seidl";
        primeiroLivro.editora = "Objetiva";
        primeiroLivro.duracao = LocalTime.of(10, 45);
        primeiroLivro.versao = VersaoEnum.RESUMIDA;
        primeiroLivro.preco = 29.90;
        primeiroLivro.resumo = "Explora como os hábitos funcionam e como podem ser transformados.";
        primeiroLivro.exibir();
    }
}