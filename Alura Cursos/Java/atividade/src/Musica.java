/*
 * Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
 */

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int numAvaliacoes;
    double notaTotal;
    double sumAvaliacoes;

    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
    }

    public void imprimiInfo() {
        System.out.println("-----------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Lançamento: " + this.anoLancamento);
        System.out.println("Avaliação: " + this.notaTotal);
        System.out.println("Qtd. Avaliações: " + this.numAvaliacoes);
        System.out.println("-----------------------");
    }

    public void avaliar(double nota) {
        this.numAvaliacoes++;
        if (this.numAvaliacoes > 1) {
            this.notaTotal = (this.sumAvaliacoes + nota) / this.numAvaliacoes;
            return;
        }
        this.sumAvaliacoes = nota;
        this.notaTotal = nota;
    }
}
