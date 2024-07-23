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

    private void notaAtual() {
        System.out.println("Nota atual: " + this.calcularMedia());
    }

    public void adicionarNota(double nota) {
        this.notas += nota;
        this.qtdNotas++;
        this.notaAtual();
    }

    public void retirarNota(double nota) {
        if(this.notas > nota) {
            this.notas -= nota;
            this.qtdNotas--;
            this.notaAtual();
            return;
        }
        this.notas = 0;
        this.qtdNotas = 0;
        this.notaAtual();    
    }

    public double calcularMedia() {
        if(this.qtdNotas > 1) {
            return this.notas / this.qtdNotas;
        }
        return this.notas;
    }
}
