package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.Enums.VersaoEnum;
import java.time.LocalTime;

public class AudioBook extends Livro {
    public String narrador;
    public LocalTime duracao;
    public VersaoEnum versao;

    protected void exibirDetalhes() {
        System.out.println("Narrador: " + narrador);
        System.out.println("Duração: " + duracao);
        System.out.println("Versão: " + versao);
    }
}