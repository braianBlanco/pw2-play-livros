package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.Enums.VersaoEnum;
import java.time.LocalTime;

public class Livro {
    public String titulo;
    public String autor;
    public LocalTime duracao;
    public String resumo;
    public double preco;
    public String editora;
    public String narrador;
    public VersaoEnum versao;

    public void exibir() {
        System.out.println("------------------------------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Narrador: " + narrador);
        System.out.println("Editora: " + editora);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Versão: " + versao);
    }
}