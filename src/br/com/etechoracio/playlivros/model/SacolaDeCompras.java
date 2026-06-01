package br.com.etechoracio.playlivros.model;

public class SacolaDeCompras {
    private double total;


    public void adicionar(Livro livro) {
        System.out.println("Adicionando à sacola: " + livro.titulo);
        this.total += livro.preco;
        livro.exibir();
    }

    public double getTotal() {
        return this.total;
    }
}