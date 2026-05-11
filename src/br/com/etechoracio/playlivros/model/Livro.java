package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.Enums.DisponibilidadeEnum;
import br.com.etechoracio.playlivros.Enums.VersaoEnum;

import java.time.LocalDate;
import java.time.LocalTime;

public class Livro {
    public String titulo;
    public String autor;
    public double preco;
    public int paginas;
    public String editora;
    public String isbn;
    
    public LocalDate dataLancamento;
    public String narrador;
    public LocalTime duracao;
    public VersaoEnum versao;
    public String resumo;

    public DisponibilidadeEnum obterDisponibilidade() {
        LocalDate dataAtual = LocalDate.now();

        if (this.dataLancamento == null) {
            return DisponibilidadeEnum.INDISPONIVEL;
        } else if (dataLancamento.isAfter(dataAtual)) {
            return DisponibilidadeEnum.EM_PRE_VENDA;
        } else if (dataLancamento.isAfter(dataAtual.minusDays(30))) {
            return DisponibilidadeEnum.LANCAMENTO_RECENTE;
        } else {
            return DisponibilidadeEnum.DISPONIVEL;
        }
    }

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Editora: " + editora);

        System.out.println("Status: " + obterDisponibilidade());
        System.out.println("--------------------------");
    }
}