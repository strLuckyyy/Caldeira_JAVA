public class Produto {

    String nome;
    double preco;
    double descontoParaPix;

    public double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            double precoFinal = this.preco - this.descontoParaPix;
            return precoFinal;
        } else {
            double precoFinal = this.preco;
            return precoFinal;
        }
    }

}