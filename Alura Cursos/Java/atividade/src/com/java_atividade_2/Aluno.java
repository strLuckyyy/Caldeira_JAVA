package com.java_atividade_2;

/*
 * Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
 */

public class Aluno {
    private String nome;
    private double notas;
    private int qtdNotas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = 0;
        this.qtdNotas = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        this.notas += nota;
        this.qtdNotas++;
    }

    public void retirarNota(double nota) {
        this.notas -= nota;
    }

    public double calcularMedia() {
        return this.notas / this.qtdNotas;
    }
}
