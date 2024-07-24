package com.java_project.testes;

import java.util.List;
import com.java_project.support.Help;

public class Vetores {
    private List<Integer> itens;

    public Vetores(List<Integer> itens) {
        this.itens = itens;
    }

    public List<Integer> getItens() {
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
