package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Usuario;

public class TestaAvaliacao {

    public static void main(String[] args) {
        Usuario horacio = new Usuario("Horácio Augusto");

        Avaliacao avaliacao1 = new Avaliacao();
        avaliacao1.exibir();
    }
}