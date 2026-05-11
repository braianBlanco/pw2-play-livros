package br.com.etechoracio.playlivros.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Avaliacao {
    public String titulo;
    public String comentario;
    public int estrelas;
    public LocalDate data;
    public Usuario usuario;


    public String obterDataPorExtenso() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
        return formatador.format(data);
    }

    public void exibir() {
        System.out.println(" ");
        System.out.println(usuario.nome);
        System.out.println(estrelas + " estrelas - " + titulo);

        System.out.println("Avaliado em " + obterDataPorExtenso());
        System.out.println(comentario);
    }
}