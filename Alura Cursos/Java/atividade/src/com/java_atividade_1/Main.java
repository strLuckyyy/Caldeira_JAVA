package com.java_atividade_1;

import java.util.*;

public class Main {
    public static String listening (String text) {
        @SuppressWarnings("resource")
        Scanner listen = new Scanner(System.in);

        System.out.println(text);
        return listen.nextLine();
    }

    public static void waitInput () {
        @SuppressWarnings("resource")
        Scanner waiting = new Scanner(System.in);
        waiting.nextLine();
    }

    public static void clearConsole () {
        System.out.print("\033\143");
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Musica disritmia = new Musica("Disritmia", "Martinho Da Vila", 1974);
        Carro fusca = new Carro("Fusca", "azul", 1990);
        Aluno carlinhos = new Aluno("Carlinhos", 12);
        
        clearConsole();

        Pessoa.mensagem();
        
        String numero = listening("Digite um numero ");
        System.out.println(calculadora.dobro(Integer.parseInt(numero)));

        String nota = listening("Que nota você dá, de 0 a 10, a " + disritmia.titulo + "?");
        disritmia.avaliar(Integer.parseInt(nota));
        disritmia.avaliar(3);
        disritmia.avaliar(6);
        disritmia.avaliar(9.5);
        disritmia.avaliar(5.5);
        disritmia.imprimiInfo();

        System.out.println("O " + fusca.modelo + " tem " + fusca.calcularIdadeCarro() + "anos.");

        carlinhos.imprimeInfo();
    }
}
