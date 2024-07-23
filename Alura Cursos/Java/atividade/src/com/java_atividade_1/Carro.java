package com.java_atividade_1;
/*
 * Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
 */

import java.util.Calendar;
import java.util.Date;

public class Carro {
    String modelo;
    String cor;
    int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void imprimeInfo() {
        System.out.println("-----------------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("-----------------------");
    }

    public int calcularIdadeCarro() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        int year = calendar.get(Calendar.YEAR);

        return year - this.ano;
    }
}
