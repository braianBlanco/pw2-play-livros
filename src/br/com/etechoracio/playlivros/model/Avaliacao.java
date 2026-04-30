package br.com.etechoracio.playlivros.model;

import java.time.LocalTime;

public class Avaliacao
{
    float estrela;
    public String comentario;
    LocalTime data;
    public Usuario usuario;
    boolean aprovacao;

    public void exibir() {
        System.out.println("Horácio Augusto da Silveira");
        System.out.println("5 estrelas - Livro excelente");
        System.out.println("Avaliado em 2026-04-21T13:12");
        System.out.println("Livro excelente, muito bem escrito. Chegou no prazo e bem embalado");
    }
}