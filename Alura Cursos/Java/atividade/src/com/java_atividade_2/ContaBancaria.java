package com.java_atividade_2;

/*
 * Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
 */

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            return;
        }
        System.out.println("Não há saldo o suficiente");
    }
}
