import java.util.ArrayList;
import java.util.List;

import com.java_project.support.Help;

public class Testes {
    public class Vetores {
        private ArrayList<Integer> itens;

        public Vetores(ArrayList<Integer> itens) {
            this.itens = itens;
        }

        public ArrayList<Integer> getItens() {
            return itens;
        }

        public void addItens(int newItem) {
            this.itens.add(newItem);
        }

        public void removeItens() {
            printin();
            int index = Help.listeningInt("Qual index? ");

            this.itens.remove(index);
        }

        public void printin() {
            for(int i = 0; i < this.itens.size(); i++){
                System.out.println(i + " - " + this.itens.get(i));
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> list = ;

            Vetores vet = new Vetores()
        }
    }
}
