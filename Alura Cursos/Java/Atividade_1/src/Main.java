//Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil,
// com o método main, que ao executar deverá imprimir um cumprimento personalizado no console.
// Por exemplo, "Olá, [Seu Nome]!".

//Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada.
// Por exemplo, "Tudo bem?".

//Crie uma classe chamada Estudos para imprimir anotações de estudos no console.

//Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5.
// Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15"
// ao invés da expressão "10+5".

//Crie uma classe Subtração para imprimir o resultado de 10 - 5 no console.
public class Main {
    public static void main(String[] args) {
        String nome = "Abrahão";


        System.out.println("Hello " + nome);
        System.out.println("How are you?");

        System.out.println("Lista de anotações");
        Study anotacoes = new Study();
        anotacoes.main();
    }


}

class Study {
    public static void main(String[] args) {
        String anotacoes = "anotaçao";
        int numero = 20;

        for (int i = 0; i < numero; i++) System.out.print(anotacoes + i);
    }
}
