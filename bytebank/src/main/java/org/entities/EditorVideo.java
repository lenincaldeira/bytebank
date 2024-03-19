package org.entities;

public class EditorVideo extends Funcionario {
    public double getBonificacao() {
        System.out.println("Chamando metodo de bonificacao do Editor de video");
        return 150;
    }
}
