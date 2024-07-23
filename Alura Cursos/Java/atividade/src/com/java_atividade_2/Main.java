package com.java_atividade_2;

import com.support.*;

public class Main {
    public static void main(String[] args) {
        Support linha = new Support();
        Support.clearConsole();

        // classe aluno
        Aluno george = new Aluno("George");

        String nota = Support.listening("Adicionar nota: ");
        george.adicionarNota(Double.parseDouble(nota));

        nota = Support.listening("Remover nota: ");
        george.retirarNota(Double.parseDouble((nota)));

        double media = george.calcularMedia();
        System.out.println(media);

        linha.split(30);

        // classe conta bancaria
        ContaBancaria conta = new ContaBancaria(001, "George");
        System.out.println("Titular da conta" + conta.titular);

        String deposito = Support.listening("Desejas depositar quanto? ");
        conta.deposito(Double.parseDouble(deposito));

        String saque = Support.listening("Quanto desejas sacar? ");
        conta.saque(Double.parseDouble(saque));

        linha.split(30);

        // classe idade pessoa
        IdadePessoa idade = new IdadePessoa(george.getNome(), 19);

        idade.verificarIdade();

        linha.split(30);

        // classe produto
        Produto hamburguer = new Produto("Hamburger de Salame", 23.90);

        System.out.println("Preço: " + hamburguer.getPreco());

        String desconto = Support.listening("Quanto de desconto? ");
        hamburguer.desconto(Double.parseDouble(desconto));
        System.out.println("Preço: " + hamburguer.getPreco());

        linha.split(30);
    }
}
