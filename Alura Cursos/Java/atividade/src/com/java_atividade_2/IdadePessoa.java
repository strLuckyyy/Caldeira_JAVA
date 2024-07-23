package com.java_atividade_2;

/**
 * Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
 */

public class IdadePessoa {
    private String nome;
    private int idade;

    public IdadePessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade() {
        if(this.idade < 18) {
            System.out.println("menor de idade");
            return;
        }
        System.out.println("maior de idade");
    }
}