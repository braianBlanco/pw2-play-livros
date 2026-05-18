package br.com.etechoracio.playlivros.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Avaliacao
{
    float estrelas;
    public String comentario;
    LocalTime data;
    public Usuario usuario;
    boolean aprovacao;
    public String titulo;
    private boolean aprovado;

    public void aprovar(){
        this.aprovado = true;
    }

    public void exibir() {
        if(aprovado = true){
            System.out.println("  ");
            System.out.println(usuario.getNome());
            System.out.println(estrelas + " estrelas " + titulo);
            System.out.println("Avaliado em " + obterDataPorExtenso());
            System.out.println(comentario);
        }
    }

    public String obterDataPorExtenso(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d 'de' 'MMMM' de 'yyyy'");
        String resultado = formatador.format(data);
        return resultado;
    }
}