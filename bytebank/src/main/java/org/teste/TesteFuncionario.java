package org.teste;

import org.entities.Cliente;
import org.entities.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();


        Gerente lenin = new Gerente();
        lenin.setNome("Lenin Caldeira");
        lenin.setCpf("339.190.128-44");
        lenin.setSalario(3527.35);

        System.out.println(lenin.getNome());
        System.out.println(lenin.getBonificacao());
    }
}
