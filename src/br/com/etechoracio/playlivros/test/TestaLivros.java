package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.Enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.AudioBook;
import br.com.etechoracio.playlivros.model.SacolaDeCompras;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestaLivros {
    public static void main(String[] args) {
        AudioBook primeiroLivro = new AudioBook();
        primeiroLivro.titulo = "O Poder do Hábito";
        primeiroLivro.autor = "Charles Duhigg";
        primeiroLivro.narrador = "Carlos Seidl";
        primeiroLivro.editora = "Objetiva";
        primeiroLivro.duracao = LocalTime.of(10, 45);
        primeiroLivro.versao = VersaoEnum.RESUMIDA;
        primeiroLivro.preco = 29.90;
        primeiroLivro.resumo = "Explora como os hábitos funcionam e como podem ser transformados.";

        primeiroLivro.dataCantonment = LocalDate.now().minusDays(5);

        SacolaDeCompras sacola = new SacolaDeCompras();
        sacola.adicionar(primeiroLivro);

        System.out.println("====================");
        System.out.println("TOTAL DA SACOLA: R$ " + sacola.getTotal());
        System.out.println("====================");
    }
}