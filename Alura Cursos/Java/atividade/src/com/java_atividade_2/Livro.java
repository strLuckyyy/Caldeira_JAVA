package com.java_atividade_2;

import com.support.*;

/*
 * Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
 */

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes() {
        Support linha = new Support();
        
        linha.split(30);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        linha.split(30);
    }
}
