package com.java_project.testes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testList.add(i);
        }

        Vetores vet = new Vetores(testList);

        vet.printin();
        vet.addItens(6);
        vet.printin();
        vet.removeItens();
        vet.printin();
    }
}
